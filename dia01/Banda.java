package dia02;

// cenário: um switch tem 1000 mbps de banda no uplink, compartilhados entre 24 portas de acesso.
// eu quero saber quanto sobra em média para cada porta
// o resultado esperado é de 41,6 mbps por porta

public class Banda {
    public static void main(String[] args) {
        int uplinkSw = 1000;
        int numPortas = 24; 
        double mediaBanda = uplinkSw / numPortas;
        System.out.println("Banda por porta: " + mediaBanda);

    }
}

public class Banda {
    public static void main(String[] args) {
        double uplinkSwi = 1000;
        double numePortas = 24;
        System.out.println("Banda por portas: " + (uplinkSwi / numePortas));
    }
}