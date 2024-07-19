public class InitializeProduct {

    public static LinkedListCustom productList = new LinkedListCustom();

    public void initializeProducts() {
        Product product_1 = new Product("MORANGO", 28);
        Product product_2 = new Product("BANANA", 14);
        Product product_3 = new Product("UVA", 36);

        productList.addLast(product_1);
        productList.addLast(product_2);
        productList.addLast(product_3);
    }
}
