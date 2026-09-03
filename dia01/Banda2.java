package dia02;

public class Banda2 {
    public static void main(String[] args) {
        double uplinkSwi = 1000;
        double numePortas = 24;
        System.out.println("Banda por portas: " + (uplinkSwi / numePortas)); 
    }
}
// refazendo o codigo de Banda pois nesse eu uso double e sai o resultado exato dessa divisao
// que no caso é: 41.666666666666664