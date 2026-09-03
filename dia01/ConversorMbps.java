package dia01;

// um link de rede tem uma velocidade x em mbps. calcule e imprima essa velocidade em mb/s.

public class ConversorMbps {
    public static void main(String[] args) {
      int bitsporByte = 8;
      int velocidade = 600;

      // calculo de conversão
      System.out.println("Velocidade em MB/s: " + (velocidade / bitsporByte));


    }
}
