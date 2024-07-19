public class Main {

    public static Menu menu = new Menu();
    public static InitializeProduct initializer = new InitializeProduct();

    public static void main(String[] args) {

        initializer.initializeProducts();

        while (true) {
            menu.showMenu();
        }
    }
}