package uniajc;

public class Parcial2Prog {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Smaug", 100, 20, "Rojas");
        Guerrero guerrero = new Guerrero("Conan", 120, 15, "Espada");
        Mago mago = new Mago("Gandalf", 80, 10);

        Arma espada = new Arma("Espada de Hierro", 10);
        Arma baston = new Arma("Bastón Mágico", 15);

        dragon.equiparArma(espada);
        guerrero.equiparArma(espada);
        mago.equiparArma(baston);
        mago.aprenderHechizo();

        
    }
}

