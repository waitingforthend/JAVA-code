package dia03;

// treino de tipos de print e comportamento de variaveis

public class Laboratorio {
    public static void main(String[] args) {
        System.out.println(7 / 2); // aqui é int + int entao o resultado esperado sera de 3
        System.out.println("R: " + 7 / 2); // aqui tem string + int e nesse caso sera R: 72
        System.out.println(1 + 2 + " portas"); // operacao sera lida da esquerda para a direita portanto
        // o resultado esperado eh de "3 portas"
        System.out.println("portas: " + 1 + 2); // resultado: portas: 12
        System.out.println('A' + 1); // resultado sera A1
        System.out.println(7 / 2.0); // resultado esperado 3.5
    }
}

// Resposta apos rodar o programa:
// 1 - certo
// 2 - certo
// 3 - errado. - nem todos os operadores tem o mesmo peso. o / resolve antes de qualquer +
// ou seja nesse caso a conta seria feita antes de concatenar e a resposta correta é 3
// 4 - errado. aspas simples faz com que o A vire uma posicao, em java a posicao de char é 65. 
// resultado correto: 66
// 5 - certo.
