package uniajc;

public class Guerrero extends Criatura {
    private String armaNombre;
    private Arma arma;
 
    public Guerrero(String nombre, int salud, int fuerza, String armaNombre) {
        super(nombre, salud, fuerza);
        this.armaNombre = armaNombre;
    }
 
    public void equiparArma(Arma arma) {
        this.arma = arma;
    }
 
    @Override
    public void atacar(Criatura objetivo) {
        int dañoBase;
        if (arma != null) {
            dañoBase = getFuerza() + arma.getDaño();
        } else {
            dañoBase = getFuerza();
        }
    }
 
    @Override
    public int defender(int daño) {
        setSalud(getSalud() - daño);
        return daño;
    }
}
