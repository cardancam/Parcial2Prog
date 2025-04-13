package uniajc;

public class Mago extends Criatura implements Magico {
    private String hechizos;

    public Mago(String hechizos, String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println("El mago lanzo el hechizo bola de fuego");
    }

    @Override
    public void aprenderHechizo() {
        System.out.println("El mago aprendio el hechizo bola de fuego");
    }  

    @Override
    public void atacar(Criatura objetivo) {
        
    }

    @Override
    public int defender(int daño) {
        daño -= 2;
        return daño;
    }
}
