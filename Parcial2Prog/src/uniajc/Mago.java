package uniajc;

public class Mago extends Criatura implements Magico {

    private String nombreHechizo;
    private int dañoHechizo;
    private Arma arma;
    private int energia;

    public Mago(String nombre, int salud, int fuerza, int energia) {
        super(nombre, salud, fuerza);
        this.energia = energia;
        this.nombreHechizo = null;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void atacar(Criatura objetivo) {
        if (arma != null) {
            int daño = getFuerza() + arma.getDaño();
            objetivo.defender(daño);
        } else {
            objetivo.defender(getFuerza());
        }
    }

    @Override
    public int defender(int daño) {
        setSalud(getSalud() - daño);
        return daño;
    }

    @Override
    public void lanzarHechizo() {
        if (nombreHechizo == null) {
            System.out.println(getNombre() + " no tiene ningún hechizo aprendido.");
            return;
        }else{
            System.out.println(getNombre() + " lanza el hechizo " + nombreHechizo);
        }
    }

    @Override
    public void aprenderHechizo() {
        this.nombreHechizo = nombreHechizo;
        this.dañoHechizo = 15;
        System.out.println(getNombre() + " aprendió el hechizo: " + nombreHechizo);
    }
}
