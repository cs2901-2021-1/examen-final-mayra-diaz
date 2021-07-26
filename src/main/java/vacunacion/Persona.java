package vacunacion;

import java.time.LocalDate;

public class Persona {
    int dni;
    String nombres;
    String apellidos;
    LocalDate fechaNacimiento;
    int centroVacunacion;
    int estaVacunado;

    public Persona(Persona p){
        this.dni = p.dni;
        this.nombres = p.nombres;
        this.apellidos = p.apellidos;
        this.fechaNacimiento = p.fechaNacimiento;
        this.centroVacunacion = p.centroVacunacion;
        this.estaVacunado = p.estaVacunado+1;
    }

    public Persona(int dni, String nombres, String apellidos, LocalDate fechaNacimiento, int centroVacunacion) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.centroVacunacion = centroVacunacion;
        this.estaVacunado = 0;
    }

    public Persona(int dni, String nombres, String apellidos, LocalDate fechaNacimiento, int centroVacunacion, int estaVacunado) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.centroVacunacion = centroVacunacion;
        this.estaVacunado = estaVacunado;
    }

    public int getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getCentroVacunacion() {
        return centroVacunacion;
    }

    public int getEstaVacunado() {
        return estaVacunado;
    }

    public void setEstaVacunado(int estaVacunado) {
        this.estaVacunado = estaVacunado;
    }
}
