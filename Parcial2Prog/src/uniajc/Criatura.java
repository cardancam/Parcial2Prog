package uniajc;

public abstract class Criatura {
    private String nombre;
    private int salud, fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    public boolean estaViva(){
        return salud > 0;
    }
    
    public abstract void atacar(Criatura objetivo);
    public abstract int defender (int daño);

       
}
