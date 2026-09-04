package dia05;

import java.util.Scanner;

public class CalculadoraHEv4 {
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
        double horaExtra50 = horasExtras50 * valorHora * 1.50;
        double horaExtra100 = horasExtras100 * valorHora * 2.00;
        double horaExtra = horaExtra50 + horaExtra100;
        double interjornada = interJornadaHoras * valorHora * 1.50;    
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


        // ADICIONANDO IMPOSTO DE RENDA, INSS E FGTS NOS CALCULOS:

        // INSS:
        double valeTransporte = salarioBruto * 0.06;
        double inss;
        if (salarioBrutoTotal <= 1612.00) {
            inss = salarioBrutoTotal * 0.075;
        } else if (salarioBrutoTotal <= 2902.84) {
            inss = salarioBrutoTotal * 0.09 - 24.32;
        } else if (salarioBrutoTotal <= 4354.27) {
            inss = salarioBrutoTotal * 0.12 - 111.40;
        } else if (salarioBrutoTotal <= 8475.55) {
            inss = salarioBrutoTotal * 0.14 - 198.49;
        } else {
            inss = 988.09;
        }

        // IRPF:

        double baseIRPF = salarioBrutoTotal - inss;
        double impostoRenda;
        if (baseIRPF <= 5000.00) {
            impostoRenda = 0;
        } else if (baseIRPF <= 7350.00) {
            double impostoTabela = baseIRPF * 0.275 - 908.73;
            double descontoSalarioImposto = 978.62 - (0.133145 * baseIRPF);
            impostoRenda = impostoTabela - descontoSalarioImposto;
        } else if (baseIRPF <= 4664.68) {
            impostoRenda = baseIRPF * 0.225 - 675.49;
        } else {
            impostoRenda = baseIRPF * 0.275 - 908.73;
        }

        double FGTS = salarioBrutoTotal * 0.08;
        double salarioLiquido = salarioBrutoTotal - inss - impostoRenda - valeTransporte;

        long salarioLiquidoArredondado = Math.round(salarioLiquido);
        System.out.print("Salário líquido aproximado: " + "R$ " + salarioLiquidoArredondado);
        System.out.println("Pressione Enter para sair");
        sc.nextLine();

    }
}

