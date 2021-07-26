package vacunacion;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;

public class VacunacionHandler {

    double totalPersonas = 22935.533;
    int vacunados = 0;
    int parcialmenteVacunados = 0;

    HashMap<Integer, Persona> from18to39 = new HashMap<>();
    HashMap<Integer, Persona> from40to49 = new HashMap<>();
    HashMap<Integer, Persona> from50to59 = new HashMap<>();
    HashMap<Integer, Persona> from60to69 = new HashMap<>();
    HashMap<Integer, Persona> from70to79 = new HashMap<>();
    HashMap<Integer, Persona> from80 = new HashMap<>();

    HashMap<Integer, CentroVacunacion> centrosVacunacion = new HashMap<>();

    public VacunacionHandler() {
    }

    public int getVacunados() {
        return vacunados;
    }

    public int getParcialmenteVacunados() {
        return parcialmenteVacunados;
    }

    public double getAvance(){
        return 100*(vacunados+parcialmenteVacunados)/totalPersonas;
    }

    public double getCobertura(){
        return 100*vacunados/totalPersonas;
    }

    public int getCantidadCentros(){
        return centrosVacunacion.size();
    }

    public void darDeBaja(int id){
        centrosVacunacion.get(id).setEstado(false);
    }

    public void darDeAlta(int id){
        centrosVacunacion.get(id).setEstado(true);
    }

    public void agregarCentro(String ubicacion, String nombre){
        var id = centrosVacunacion.size();
        centrosVacunacion.put(id, new CentroVacunacion(id, ubicacion, nombre));
    }

    public void agregarPersonas(int centroVacunacion, List<Persona> personas){
        var parcialmenteVacunadas = 0;
        var vacunadas = 0;
        for (Persona p : personas) {
            switch (p.estaVacunado){
                case 0: {
                    parcialmenteVacunadas += 1;
                    agregarPersona(p);
                    break;
                }
                case 1:{
                    vacunadas +=1;
                    actualizarPersona(p);
                    break;
                }
                default:
            }
        }
        centrosVacunacion.get(centroVacunacion).agregarVacunados(vacunadas);
        centrosVacunacion.get(centroVacunacion).agregarVacunadosParcialmente(parcialmenteVacunadas);
        this.vacunados += vacunadas;
        this.parcialmenteVacunados = parcialmenteVacunadas;
    }

    int calculateAge(LocalDate birthdate){
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    void agregarPersona(Persona persona){
        int age = calculateAge(persona.fechaNacimiento);
        if (age >= 80)
            from80.put(persona.dni, persona);
        else if (age >= 70)
            from70to79.put(persona.dni, persona);
        else if(age >= 60)
            from60to69.put(persona.dni, persona);
        else if(age >= 50)
            from50to59.put(persona.dni, persona);
        else if(age >= 40)
            from40to49.put(persona.dni, persona);
        else if(age >= 18)
            from18to39.put(persona.dni, persona);
    }

    void actualizarPersona(Persona p){
        int age = calculateAge(p.fechaNacimiento);
        if (age >= 80)
            from80.put(p.dni, new Persona(p));
        else if (age >= 70)
            from70to79.put(p.dni, new Persona(p));
        else if(age >= 60)
            from60to69.put(p.dni, new Persona(p));
        else if(age >= 50)
            from50to59.put(p.dni, new Persona(p));
        else if(age >= 40)
            from40to49.put(p.dni, new Persona(p));
        else if(age >= 18)
            from18to39.put(p.dni, new Persona(p));
    }
}
