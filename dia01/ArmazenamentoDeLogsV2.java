public class ArmazenamentoDeLogsV2 {
    public static void main(String[] args) {
        
        // no outro código eu coloquei o valor 1024 duas vezes em duas variáveis diferentes, analisando melhor, a melhor forma é 
        // criar uma variável para o valor 1024 e usar ela nas contas.
        
        double bytesPorDia = 5000.0;
        double kbPorDia = bytesPorDia / 1024;
        double mbPorDia = kbPorDia / 1024;
        double gbPorDia = mbPorDia / 1024;
        
        System.out.println("KB por dia: " + kbPorDia);
        System.out.println("GB por dia: " + gbPorDia);
        
    }
}
