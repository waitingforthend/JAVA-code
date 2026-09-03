package dia05;

import java.util.Scanner;

public class calculadoradeHE {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Salário bruto mensal: R$ ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Carga horária mensal (ex: 220): ");
        double cargaHoraria = sc.nextDouble();

        System.out.print("Horas extras trabalhadas: ");
        double horasExtras = sc.nextDouble();

        System.out.print("Percentual da hora extra (50 ou 100): ");
        double percentualHE = sc.nextDouble();

        System.out.print("Horas de interjornada devidas: ");
        double horasInterjornada = sc.nextDouble();


        double valorHora = salarioBruto / cargaHoraria;
        double valorHoraNoturna = valorHora * 1.20;  // adicional noturno de 20%
        double valorHoraExtraNoturna = valorHoraNoturna * (1 + percentualHE / 100);
        double totalHorasExtras = horasExtras * valorHoraExtraNoturna;
        double totalInterjornada = horasInterjornada * valorHoraExtraNoturna;
        double salarioBrutoTotal = salarioBruto + totalHorasExtras + totalInterjornada;

        System.out.println();
        System.out.println("Valor da hora normal: R$ " + valorHora);
        System.out.println("Valor da hora extra (com noturno): R$ " + valorHoraExtraNoturna);
        System.out.println("Total de horas extras: R$ " + totalHorasExtras);
        System.out.println("Total de interjornada: R$ " + totalInterjornada);
        System.out.println("Salário bruto total: R$ " + salarioBrutoTotal);

        sc.close();

}

}