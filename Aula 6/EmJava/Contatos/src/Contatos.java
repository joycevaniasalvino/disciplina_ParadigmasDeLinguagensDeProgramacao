import java.util.Scanner;

public class Contatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] agenda = new String[10][4]; // 10 contatos com 4 campos (CPF, Nome, Idade, Telefone)

        leDadosDaAgenda(agenda, scanner);
        imprimeDadosDaAgenda(agenda);
    }

    public static void leDadosDaAgenda(String[][] agenda, Scanner scanner) {
        int contador = 0;
        while (contador < 10) {
            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade: ");
            String idade = scanner.nextLine();
            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine();

            agenda[contador][0] = cpf;
            agenda[contador][1] = nome;
            agenda[contador][2] = idade;
            agenda[contador][3] = telefone;

            contador++;

            System.out.print("Deseja continuar? (s/n): ");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }
    }

    public static void imprimeDadosDaAgenda(String[][] agenda) {
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i][0] != null) {
                String cpf = agenda[i][0];
                String nome = agenda[i][1];
                String idade = agenda[i][2];
                String telefone = agenda[i][3];

                System.out.println(cpf + ": " + nome + ", " + idade + " anos, " + telefone);
            }
        }
    }
}
