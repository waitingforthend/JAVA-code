package dia02;

public class configuracao {
    public static void main(String[] args) {
        int VelocidadeLink = 100;
        String intEth = "GigabitEthernet0/1";
        boolean linkAtivo = true;
        System.out.println("=== Configuração Inicial ===");
        System.out.println("Interface: " + intEth);
        System.out.println("Velocidade: " + VelocidadeLink);
        System.out.println("Link ativo: " + linkAtivo);
        System.out.println("MTU: " + mtu);

        // simulando um update de velocidade, na lógica do java basta mudar a ordem da linha de código

        VelocidadeLink = 1000;
        System.out.println("Velocidade após upgrade: " + VelocidadeLink);

    }
}
