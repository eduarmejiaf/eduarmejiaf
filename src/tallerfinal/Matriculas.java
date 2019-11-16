package tallerfinal;

public class Matriculas extends Comunidad {

    private String cedest;
    private String codasig;
    private int grupo;

    public Matriculas(String cedula, String nombre, String cedest, String codasig, int grupo) {
        super(cedula, nombre);
        this.cedest = cedest;
        this.codasig = codasig;
        this.grupo = grupo;

    }

    public void setCedest(String cedest) {
        this.cedest = cedest;
    }

    public void setCodasig(String codasig) {
        this.codasig = codasig;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getCedest() {
        return cedest;
    }

    public String getCodasig() {
        return codasig;
    }

    public int getGrupo() {
        return grupo;
    }

}
