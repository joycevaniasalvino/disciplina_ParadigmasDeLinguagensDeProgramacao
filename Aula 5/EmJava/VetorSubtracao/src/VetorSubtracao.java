import java.util.Scanner;

public class VetorSubtracao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + i + " do vetor A: ");
            vetorA[i] = input.nextInt();
            System.out.print("Digite o elemento " + i + " do vetor B: ");
            vetorB[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetorC[i]);
        }
    }
}
