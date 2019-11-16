package tallerfinal;

import javax.swing.JOptionPane;

public class Asignatura {

    private String codigo;
    private String nombre;
    private int grupo;
    private int semestre;
    private int creditos;
    private String cedprof;

    public void Mostrar() {
        System.out.println(" Codigo: " + codigo 
                + " Grupo: " + grupo
                + " Nombre: " + nombre
                + " Semestre: " + semestre
                + " Creditos: " + creditos
                + " Cedula del Profesor: " + cedprof);

    }

    public Asignatura(String codigo, String nombre, int grupo, int semestre, int creditos, String cedprof) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grupo = grupo;
        this.semestre = semestre;
        this.creditos = creditos;
        this.cedprof = cedprof;

    }

}
