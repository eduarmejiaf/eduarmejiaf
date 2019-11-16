package tallerfinal;

public class Comunidad {

    private String cedula;
    private String nombre;

    public Comunidad(String cedula, String nombre) {

        this.cedula = cedula;
        this.nombre = nombre;

    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void Mostrar() {
        System.out.println(nombre + " número de identificacion: " + cedula);
    }

}
