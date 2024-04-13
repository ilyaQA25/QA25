package models;

import lombok.*;

@Data
public class Product {
    private String productName;
    @Getter
    private static String id;

    public Product(String id, String productName) {
        this.id = id;
        this.productName = productName;
    }
}
