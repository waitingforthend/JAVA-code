package dia05;

import java.util.Scanner;

// aperfeiçoamento da calculadora de hora extra
// usuario deve ser possibilitado de inserir se trabalhou ou não nos fins de semana
// baseada na profissao de uma pessoa que nao dorme (telecom kkk)

public class CalculadoraHEv2 {
    public static void main(String[] args) {
        // vamos pedir input do usuario:
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Qual é a sua carga horária MENSAL (Se for 40h semanais, será 200h, se for 44 será 220h e assim por diante): ");
        double cargaHoraria = sc.nextDouble();

        System.out.print("Horas extras de 50%: ");
        double horasExtras50 = sc.nextDouble();

        System.out.print("Horas extra de 100%: ");
        double horasExtras100 = sc.nextDouble();

        System.out.print("Houve interjornada (digitar Sim ou Não)? "); // usuario deve responder sim ou não e depois perguntar a quantidade
        String respostaInterjornada = sc.next();
       
        System.out.print("Quantas horas de interjornada foram realizadas: ");
        double interJornadaHoras = sc.nextDouble(); // SE fez interjornada, o usuario precisa preencher quantas horas

        // varioaveis doubles
        double valorHora = salarioBruto / cargaHoraria;
        double adicionalNoturno = (horasExtras50 + horasExtras100) * valorHora * 0.20;
        double horaExtra50 = horasExtras50 * valorHora * 0.50;
        double horaExtra100 = horasExtras100 * valorHora * 1.00;
        double horaExtra = horaExtra50 + horaExtra100;
        double interjornada = interJornadaHoras * valorHora * 0.50;    
        double dsrAdicionalNoturno = 0;
        double dsrHoraExtra = 0;
        
        // agora a minha ideia basicamente eh ver se o usuario trabalhou fim de semana. spoiler: trabalhou

        System.out.print("Houve horas extras nos finais de semana? (Sim ou Não): ");
        String respostaFimdeSemana  = sc.next();
        if (respostaFimdeSemana.equals("Sim")) {
            System.out.print("Quantos dias úteis teve no mes? (Inserir somente número): ");
            double respostaDias = sc.nextDouble();
            System.out.print("Quantos sábados/domingos/feriados foram trabalhados? (Somente número): ");
            double respostaFeriados = sc.nextDouble();
            dsrAdicionalNoturno = (adicionalNoturno / respostaDias) * respostaFeriados;
            dsrHoraExtra = (horaExtra / respostaDias) * respostaFeriados;
        
        }
        double salarioBrutoTotal = salarioBruto + adicionalNoturno + horaExtra + interjornada + dsrAdicionalNoturno + dsrHoraExtra;


    }
}
