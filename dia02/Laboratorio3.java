package dia03;

// Recebi a seguinte saida:

// === Relatorio de Uplink ===
// Switch: SW-CORE-01
// Portas ativas: 18 de 24
// Ocupacao: 75.0%
// Banda por porta: 50.0 Mbps

// Objetivo: transformar em codigo.

// PRIMEIRA FORMA:

public class Laboratorio3 {
    public static void main(String[] args) {
        System.out.println("=== Relatorio de Uplink ===");
        System.out.println("SW-CORE-01");
        System.out.println("Portas ativas: 18 de 24");
        System.out.println("Ocupação: 75%");
        System.out.println("Banda por porta: 50.0 Mbps");
        
// Entretanto existe uma segunda forma de fazer esse mesmo programa
// (nao necessariamente a melhor forma)
// levando em consideracao que para ter 50 mbps em 18 portas, 
// o link precisa ser de pelo menos 900mbps ou mais, sendo assim eu irei considerar
// um link de 900 mbps

        int totalPortas = 24;
        int portasUsadas = 20;
        double bandaLarga = 900;
        double utilizacao = (double) portasUsadas / totalPortas * 100;
        double bandaporPorta = bandaLarga / portasUsadas;

        System.out.println("=== Relatório de Uplink ===");
        System.out.print("SW-CORE-01");
        System.out.println();
        System.out.println("Portas ativas: " + portasUsadas + " de 24");
        System.out.println("Ocupação: " + utilizacao);
        System.out.println("Banda por porta: " + bandaporPorta);

// faço as variaveis serem calculadas e utilizo-as como formulas no print
// para fixar (pois sofri nesse exercicio) como as operacoes e os tipos de variaveis funcionam
// o (double) serve para tratar um numero como decimal em uma formula especifica

    }
}


