package model.entities.products;

import model.entities.Entity;

import java.time.LocalDate;

public class StockProduct extends Entity {
    private Product product;
    private int quantity;
    private LocalDate validity;

    public StockProduct(){

    }

    public StockProduct(Product product, int quantity, LocalDate validity) {
        this.product = product;
        this.quantity = quantity;
        this.validity = validity;
    }

    public void sell(int quantity){
        this.quantity += quantity;
    }

    public void add(int quantity){
        this.quantity += quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        if (product != null){
            this.product = product;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getValidity() {
        return validity;
    }

    public void setValidity(LocalDate validity) {
        //TODO validação da data
        this.validity = validity;
    }
}
