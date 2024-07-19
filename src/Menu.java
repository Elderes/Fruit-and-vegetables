import java.util.Objects;
import java.util.Scanner;
public class Menu {
    Scanner myScanner = new Scanner(System.in);
    public void showMenu() {
        System.out.println();
        System.out.println("=======================");
        System.out.println("1. Adicionar produto.");
        System.out.println("2. Listar produtos.");
        System.out.println("3. Retirar produtos.");
        System.out.println("4. Pesquisar produto.");
        System.out.println("5. Sair.");
        System.out.println("=======================");
        System.out.print("Digite o número da opção: ");

        String userInput = myScanner.next();

        if (Objects.equals(userInput, "1")) {
            System.out.println(); // Line break
            System.out.print("Digite o nome do produto: ");
            String productNameInput = myScanner.next();
            System.out.print("Digite a quantidade para adicionar: ");
            int productQuantityInput = myScanner.nextInt();
            Product newUserProduct = new Product(productNameInput, productQuantityInput);
            InitializeProduct.productList.addLast(newUserProduct);
            System.out.println("\nProducto adicionado com sucesso!");
        }

        else if (Objects.equals(userInput, "2")) {
            System.out.println(); // Line break
            System.out.println("Produtos em estoque:");
            InitializeProduct.productList.print();
        }

        else if (Objects.equals(userInput, "4")) {
            System.out.println(); // Line break
            System.out.print("Digite o nome do produto: ");
            String productNameInput = myScanner.next();
            if (InitializeProduct.productList.checkIfExists(productNameInput) == true) {
                System.out.println("O produto existe.");
            } else {
                System.out.println("O produto não existe.");
            }
        }
    }
}
