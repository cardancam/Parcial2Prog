package uniajc;

public abstract class Criatura {
    private String nombre;
    private int salud, fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }
    
    public abstract void atacar(Criatura objetivo);
    public abstract void defender (int daño);
    
    public boolean estaViva(){
        return salud > 0;
    }
}
