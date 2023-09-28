import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosParesImpares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        int somaPares = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            numeros.add(input.nextInt());
        }

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
                somaPares += numero;
            } else {
                numerosImpares.add(numero);
            }
        }

        System.out.println("Os números pares digitados são:");
        for (Integer numero : numerosPares) {
            System.out.println(numero);
        }

        System.out.println("A soma dos números pares digitados é: " + somaPares);

        System.out.println("Os números ímpares digitados são:");
        for (Integer numero : numerosImpares) {
            System.out.println(numero);
        }

        System.out.println("A quantidade de números ímpares digitados é: " + numerosImpares.size());
    }
}
