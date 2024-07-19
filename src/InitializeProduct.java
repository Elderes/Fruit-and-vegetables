public class InitializeProduct {

    public static LinkedListCustom productList = new LinkedListCustom();

    public void initializeProducts() {
        Product product_1 = new Product("Morango");
        Product product_2 = new Product("Banana");
        Product product_3 = new Product("Uva");

        productList.addLast(product_1);
        productList.addLast(product_2);
        productList.addLast(product_3);
    }
}
