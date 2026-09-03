import java.util.Scanner;
// calculadora básica
public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();
        System.out.print("Digite outro numero: ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, / e *): ");

        String operacao = sc.next();
        if (operacao.equals("+")) {
            System.out.println("Resultado: " + (numero + numero2));
        } else if (operacao.equals("-")) {
            System.out.println("Resultado: " + (numero - numero2));
        } else if (operacao.equals("*")) {
            System.out.println("Resultado: " + (numero * numero2));
        } else if (operacao.equals("/")) {
            System.out.println("Resultado: " + (numero / numero2));
        } else {
            System.out.println("Operação Inválida.");
        }
    }
}