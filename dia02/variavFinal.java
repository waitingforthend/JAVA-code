package dia04;

public class variavFinal {
    public static void main(String[] args) {
        final int PERCENTUAL = 100; // final = atribuir um valor fixo na constante
        final int totalPortas = 24;
        totalPortas = 48;
        int portasUsadas = 20;
        double bandaLarga = 900;
        double utilizacao = (double) portasUsadas / totalPortas * PERCENTUAL;
        double bandaporPorta = bandaLarga / portasUsadas;
        
        System.out.println("=== Relatório de Uplink ===");
        System.out.print("SW-CORE-01");
        System.out.println();
        System.out.println("Portas ativas: " + portasUsadas + " de 24");
        System.out.println("Ocupação: " + utilizacao);
        System.out.println("Banda por porta: " + bandaporPorta);

    }
}
