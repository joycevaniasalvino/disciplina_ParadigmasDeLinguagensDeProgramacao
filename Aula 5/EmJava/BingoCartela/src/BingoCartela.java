public class BingoCartela {

    public static int[][] gerarCartela() {
        int[][] cartela = new int[5][5];
        boolean[] numerosUsados = new boolean[100];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numero;
                do {
                    numero = (int) (Math.random() * 100);
                } while (numerosUsados[numero]);
                numerosUsados[numero] = true;
                cartela[i][j] = numero;
            }
        }

        return cartela;
    }

    public static void main(String[] args) {
        int[][] cartela = gerarCartela();
        System.out.println("Cartela de bingo:\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", cartela[i][j]);
            }
            System.out.println();
        }
    }
}
