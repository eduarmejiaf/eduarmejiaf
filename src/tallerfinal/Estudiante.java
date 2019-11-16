package tallerfinal;

public class Estudiante extends Comunidad {

    private String programa;
    private int semestre;

    public Estudiante(String cedula, String nombre, String programa, int semestre) {
        super(cedula, nombre);
        this.programa = programa;
        this.semestre = semestre;
    }

    public void Mostrar() {
        System.out.println("El estudiante " + super.getNombre()
                + " número de identificación " + super.getCedula()
                + "\ndel programa de " + programa
                + " semestre " + semestre + "\n");
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getPrograma() {
        return programa;
    }

    public int getSemestre() {
        return semestre;
    }

}
