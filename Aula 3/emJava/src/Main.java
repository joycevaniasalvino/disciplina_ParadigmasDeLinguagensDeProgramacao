package src;

import java.util.Scanner;

/*
 apagar = 0
while True:
    código = int(input("Código da mercadoria (0 para sair): "))
    preço = 0
    if código == 0:
        break
    elif código == 1:
        preço = 0.50
    elif código == 2:
        preço = 1.00
    elif código == 3:
        preço = 4.00
    elif código == 5:
        preço = 7.00
    elif código == 9:
        preço = 8.00
    else:
        print("Código inválido!")
    if preço != 0:
        quantidade = int(input("Quantidade: "))
        apagar = apagar + (preço * quantidade)
print(f"Total a pagar R${apagar:8.2f}")
*/

public class Main {
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        
        double preco;
        int codigo;
        int quantidade;
        double apagar = 0;

        
        System.out.println("Código da mercadoria (0 para sair): ");
        preco = 0;
        codigo = entrada.nextInt();
        

        if (codigo == 0){
            System.exit(0);
        }
            
        else if (codigo == 1){
            preco = 0.50;
        }
        else if (codigo == 2){
            preco = 1.00;
        }
        else if (codigo == 3){
            preco = 4.00;
        }
        else if (codigo == 5){
            preco = 7.00;
        }
        else if (codigo == 9){
            preco = 8.00;
        }
        else{
            System.out.println("Código inválido!");
        }

        if (preco != 0){
            System.out.println("Quantidade: ");
            quantidade = entrada.nextInt();
            apagar = apagar + (preco * quantidade);
        }
        entrada.close();
        System.out.println("Total a pagar R$ " + apagar);
    }
}
