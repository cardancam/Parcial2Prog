package uniajc;

public class Mago extends Criatura implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
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
    public boolean estaViva() {
        return super.estaViva();
    }

    @Override
    public int defender(int daño) {
        
        return super.defender(daño);
    }

    @Override
    public void atacar(Criatura objetivo) {
        super.atacar(objetivo);
        
        
    }
    
    
}
