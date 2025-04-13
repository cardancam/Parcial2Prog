package uniajc;

public class Dragon extends Criatura implements Volador {

    private String escamas;
    private Arma arma;

    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
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

    @Override
    public void volar() {
        System.out.println(getNombre() + " está volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println(getNombre() + " aterriza.");
    }
}
