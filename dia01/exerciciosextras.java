package dia01;

public class exerciciosextras {
    public static void main(String[] args) {
        String description = "Detalhes da Conexão:";
        int port = 40022;
        String transport = "TCP";
        String protocol = "SSH";
        
        System.out.println();
        boolean status = true;
        if (status) {
            System.out.println("Status: Conectado");
        } else {
            System.out.println("Status: Desconetado");
        }

        System.out.println(description);
        System.out.println("Porta: " + port);
        System.out.println("Protocolo: " + protocol);

        double TempodeReposta = 87.6; // tempo de resposta em milissegundos
        double PacotesEnviados = 244.0;
        double PacotesRecebidos = 124.0;
        double CRC = 0.0;

        System.out.println("Tempo de Resposta: " + TempodeReposta);
        System.out.println("Pacotes Enviados: " + PacotesEnviados);
        System.out.println("Pacotes Recebidos: " + PacotesRecebidos);
        System.out.println("Taxa de erro (CRC): " + CRC);
        System.out.println();



    }
}
