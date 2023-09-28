import java.util.Scanner;

public class CalculoVetor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;
        int maiorQCinco = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + i + ": ");
            vetor[i] = input.nextInt();
            soma += vetor[i];

            if (vetor[i] > 5) {
                maiorQCinco++;
            }
        }

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            } else if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        double media = (double) soma / vetor.length;

        System.out.println("O maior elemento do vetor é " + maior);
        System.out.println("O menor elemento do vetor é " + menor);
        System.out.println("A soma de todos os elementos do vetor é " + soma);
        System.out.println("A média de todos os elementos do vetor é " + media);
        System.out.println("O número de elementos > 5 é " + maiorQCinco);
    }
}
