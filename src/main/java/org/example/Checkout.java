package org.example;

public class Checkout {
    public static void main(String[] args) {
        Person client = new Person(1L, "Jean Paul", "jeanpaulwebb@gmail.com", "1234");
        Cart cart = new Cart();
        cart.addItem(new Product("Memória", 300, "PC", 4));
        cart.addItem(new Product("Monitor", 900, "PC", 1));
        cart.addItem(new Product("Mouse", 50, "PC", 2));
        cart.addItem(new Product("Pendrive", 50, "PC", 1));
        System.out.println(":: Cliente ::");
        System.out.println(client.getName());
        System.out.println(":: Produtos ::");
        for (Product product : cart.getProducts()) {
            System.out.println(product.getQuantity() + " - " + product.getName());
        }
        System.out.println("Quantidade de Produtos: " + cart.getProducts().size());
        System.out.println("Valor Total: R$ " + cart.getTotal());
    }
}
