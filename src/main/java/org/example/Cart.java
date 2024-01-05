package org.example;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Setter
@Getter
public class Cart {
    private ArrayList<Product> products;
    private double total;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addItem(Product product) {
        products.add(product);
    }

    public int getTotal() {
        /*
        Usando ForEach
        AtomicInteger total = new AtomicInteger();
        products.stream().forEach((Product product) -> {
            total.addAndGet(product.getValue() * product.getQuantity());
        });
        return total.get();
        */
        int total = products.stream()
                .mapToInt(product -> product.getValue() * product.getQuantity()) // Mapeia cada produto para seu valor total
                .reduce(0, Integer::sum); // Reduce acumulando a soma dos valores totais dos produtos
        return total;
    }
}
