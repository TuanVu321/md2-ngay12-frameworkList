public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
       Product product1 = new Product(01,"A");
       Product product2 = new Product(02,"B");
       productManager.add(product1);
       productManager.add(product2);
       productManager.display(1);
       productManager.find(01);


    }
}
