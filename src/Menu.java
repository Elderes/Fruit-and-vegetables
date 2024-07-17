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

        String userInput = myScanner.next();

        if (Objects.equals(userInput, "2")) {
            productList.print();
        }
    }
}
