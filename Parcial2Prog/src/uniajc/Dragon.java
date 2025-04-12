package uniajc;

public class Dragon extends Criatura implements Volador {
    private Arma arma;
    
    public Dragon(String nombre, int salud, int fuerza){
        super(nombre, salud, fuerza)
    }
    
    @Override
    public void atacar(Criatura objetivo){
        int daño = fuerza * 2;
        if (arma != null) {
            daño += arma.getDañoAdicional();
            System.out.println(nombre + "usa su arma ademas de su fuego.");
        }
        objetivo.defender(daño);
        System.out.println(nombre + "lanza un ataque de fuego a " + objetivo.getNombre() + "causando" + daño + "de daño.");
    }
    
    @Override
    public void defender(int daño){
        salud -= daño;
        if (salud < 0) salud = 0;
        System.out.println(nombre + "recibe" + daño + "de daño. Salud restante" + salud);
    }
    
    @Override
    public void volar(){
        System.out.println(nombre + "esta volando por los cielos.");
    }
    
    @Override
    public void aterrizar(){
        System.out.println(nombre + "aterriza con fuerza.");
    }
    
    @Override
    public void setArma(Arma arma){
        this.arma = arma;
        System.out.println(nombre + "ha equipado el arma: "+ arma);
    }
}
