package dia01;

// Enunciado: Um servidor gera 5000 bytes de log por dia. Calcula MB por dia, MB por mês (30 dias) e GB por ano (365 dias).


public class ArmazenamentoDeLog {
    public static void main(String[] args) {
        double LogServidor = 5000.0;
        double bytes = 1024.0;
        double MB = 1024.0;
        
        // First step: how many MB per day does the server consume?
        // Primeiro passo: quantos MB por dia o servidor consome?
        System.out.println("MB per day: " + (LogServidor / bytes / MB));

        // Second step: how many MB per month does the server consume?
        // Segundo passo:  quantos MB por mês o servidor consome?
        double mbPorMes = LogServidor / bytes / MB * 30;
        System.out.println("MB per month: " + mbPorMes);

        // Third step: how many MB per year does the server consume?
        // Terceiro passo: quantos MB por ano o servidor consome?
        double gbPorAno = LogServidor / bytes / MB / 1024 * 365;
        System.out.println("GB per year: " + gbPorAno);
        System.out.println();

        // Fourth step: Showing integer value
        // Quarto passo: Mostrando valor inteiro
        System.out.println("Bytes per day (inteiro): " + (long) LogServidor);
        System.out.println("Bytes per month (inteiro): " + (long) (LogServidor * 30));
        System.out.println("Bytes per year (inteiro): " + (long) (LogServidor * 365));





    
    

    


        
    }
}
