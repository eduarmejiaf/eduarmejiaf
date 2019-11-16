package tallerfinal;

public class Profesores extends Comunidad {

    private String profesion;
    private String categoria;

    public Profesores(String cedula, String nombre, String profesion, String categoria) {
        super(cedula, nombre);
        this.profesion = profesion;
        this.categoria = categoria;

    }

    public void Mostrar() {
        System.out.println("Profesor: " + super.getNombre()
                + ", con cc. " + super.getCedula()
                + "\nes " + profesion + " y categoria " + categoria + "\n");
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getCategoria() {
        return categoria;
    }

}
