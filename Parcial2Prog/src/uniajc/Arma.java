package uniajc;

public class Arma {
    private String nombreArma;
    private int daño;

    public Arma(String nombreArma, int daño) {
        this.nombreArma = nombreArma;
        this.daño = daño;
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    
    public void atacarConArma(Criatura objetivo){
        
    }
    public int getDañoAdicional(){
        return daño;
    }
}
