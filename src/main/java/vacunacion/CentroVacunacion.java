package vacunacion;

public class CentroVacunacion {
    int id;
    String ubicacion;
    String nombre;
    Boolean estado;
    int vacunadosParcialmente;
    int vacunados;

    public CentroVacunacion(int id, String ubicacion, String nombre) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.estado = false;
        this.vacunadosParcialmente = 0;
        this.vacunados = 0;
    }

    public int getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getVacunadosParcialmente() {
        return vacunadosParcialmente;
    }

    public void agregarVacunadosParcialmente(int vacunadosParcialmente) {
        this.vacunadosParcialmente += vacunadosParcialmente;
    }

    public int getVacunados() {
        return vacunados;
    }

    public void agregarVacunados(int vacunados) {
        this.vacunadosParcialmente -= vacunados;
        this.vacunados += vacunados;
    }
}
