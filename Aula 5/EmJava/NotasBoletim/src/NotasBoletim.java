import java.util.Scanner;

public class NotasBoletim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota do aluno " + i + " na prova 1: ");
            matriz[i][0] = input.nextInt();
            System.out.print("Digite a nota do aluno " + i + " na prova 2: ");
            matriz[i][1] = input.nextInt();
            System.out.print("Digite a nota do aluno " + i + " na prova 3: ");
            matriz[i][2] = input.nextInt();
        }

        int alunosProva1 = 0;
        int alunosProva2 = 0;
        int alunosProva3 = 0;

        for (int i = 0; i < 10; i++) {
            int piorNota = matriz[i][0];
            if (piorNota > matriz[i][1]) {
                piorNota = matriz[i][1];
            }
            if (piorNota > matriz[i][2]) {
                piorNota = matriz[i][2];
            }

            if (piorNota == matriz[i][0]) {
                alunosProva1++;
            } else if (piorNota == matriz[i][1]) {
                alunosProva2++;
            } else {
                alunosProva3++;
            }
        }

        System.out.println("O número de alunos cuja pior nota foi na prova 1 é: " + alunosProva1);
        System.out.println("O número de alunos cuja pior nota foi na prova 2 é: " + alunosProva2);
        System.out.println("O número de alunos cuja pior nota foi na prova 3 é: " + alunosProva3);
    }
}
