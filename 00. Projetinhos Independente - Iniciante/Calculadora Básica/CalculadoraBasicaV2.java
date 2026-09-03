import java.util.Scanner;

public class CalculadoraBasicaV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equals("s")) {
            System.out.print("Digite a operação desejada (inputs aceitos: +, -, *, /, % e p para cálculo de porcentagem): ");
            String operacao = sc.next();

            System.out.print("Escolha o primeiro número: ");
            double numero = sc.nextDouble();
            System.out.print("Escolha o segundo número: ");
            double numero2 = sc.nextDouble();

            if (operacao.equals("+")) {
                System.out.println("Resultado: " + (numero + numero2));
            }
            else if (operacao.equals("-"))
                System.out.println("Resultado: " + (numero - numero2));
            else if (operacao.equals("*"))
                System.out.println("Resultado: " + (numero * numero2)); 
            else if (operacao.equals("/"))
                System.out.println("Resultado: " + (numero / numero2)); 
            else if (operacao.equals("%"))
                System.out.println("Resultado: " + (numero % numero2)); 
            else if (operacao.equals("p"))
                System.out.println("Resultado: " + (numero / 100) * numero2);
        }
        sc.close(); 
        }
    }
    
