import java.util.Scanner;

public class VerificaPosicao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = input.nextInt();
        }

        int x, y;

        do {
            System.out.print("Digite o valor de X: ");
            x = input.nextInt();
        } while (!verificaPosicaoX(x));

        do {
            System.out.print("Digite o valor de Y: ");
            y = input.nextInt();
        } while (!verificaPosicaoY(y));

        System.out.println("O valor na posição X é: " + vetor[x]);
        System.out.println("O valor na posição Y é: " + vetor[y]);

        int soma = vetor[x] + vetor[y];

        System.out.println("A soma dos valores nas posições X e Y é: " + soma);
    }

    public static boolean verificaPosicaoX(int x) {
        if (x > 7 || x < 0) {
            System.out.println("Posição X inválida. Digite novamente.");
            return false;
        }
        return true;
    }

    public static boolean verificaPosicaoY(int y) {
        if (y > 7 || y < 0) {
            System.out.println("Posição Y inválida. Digite novamente.");
            return false;
        }
        return true;
    }
}
