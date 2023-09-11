// You can edit this code!
// Click here and start typing.
package main

import "fmt"

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

func main() {

	fmt.Println("Código da mercadoria (0 para sair): ")

	var preco = 0.50
	var apagar = 0.00

	fmt.Println("Codigo do produto - preco: 2- 0.50  3- 1.00  4- 4.00  5- 7.00  9- 8.00")

	var quantidade = 2.00

	apagar = apagar + (preco * quantidade)

	fmt.Println("Total a pagar R$ ", apagar)
}