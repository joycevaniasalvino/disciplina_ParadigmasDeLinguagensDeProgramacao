import java.util.Scanner;

public class FolhaDePagamentos {

    public static void main(String[] args) {
        String[][] folhaDePagamento = new String[10][5]; // 10 pessoas com 5 campos (nome, salário bruto, INSS, IRPF,
                                                         // salário líquido)
        int contador = 0;

        while (contador < 10) {
            leDadosDaFolhaDePagamento(folhaDePagamento, contador);
            contador++;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Deseja continuar? (s/n): ");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        imprimeDadosDaFolhaDePagamento(folhaDePagamento, contador);
    }

    public static void leDadosDaFolhaDePagamento(String[][] folhaDePagamento, int contador) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = Double.parseDouble(scanner.nextLine());

        double descontoINSS = calculaDescontoINSS(salarioBruto);
        double descontoIRPF = calculaDescontoIRPF(salarioBruto);
        double salarioLiquido = salarioBruto - descontoINSS - descontoIRPF;

        folhaDePagamento[contador][0] = nome;
        folhaDePagamento[contador][1] = String.valueOf(salarioBruto);
        folhaDePagamento[contador][2] = String.valueOf(descontoINSS);
        folhaDePagamento[contador][3] = String.valueOf(descontoIRPF);
        folhaDePagamento[contador][4] = String.valueOf(salarioLiquido);
    }

    public static double calculaDescontoINSS(double salarioBruto) {
        return salarioBruto * 0.08;
    }

    public static double calculaDescontoIRPF(double salarioBruto) {
        return salarioBruto > 1903.98 ? salarioBruto * 0.10 : 0;
    }

    public static void imprimeDadosDaFolhaDePagamento(String[][] folhaDePagamento, int contador) {
        System.out.println("\nFolha de Pagamento:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Nome: " + folhaDePagamento[i][0]);
            System.out.println("Salário Bruto: " + folhaDePagamento[i][1]);
            System.out.println("Desconto INSS: " + folhaDePagamento[i][2]);
            System.out.println("Desconto IRPF: " + folhaDePagamento[i][3]);
            System.out.println("Salário Líquido: " + folhaDePagamento[i][4]);
            System.out.println();
        }
    }
}
