package model.entities.products;

import model.entities.Entity;

import javax.persistence.*;

@Table(name = "products")
@javax.persistence.Entity()
public class Product extends Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false, columnDefinition = "UNSIGNED")
    private double salePrice;

    @Column(nullable = false, columnDefinition = "UNSIGNED")
    private double purchasePrice;

    @Column(nullable = false, unique = true)
    private String barCode;

    public Product(){

    }

    public Product(String name, String description, double salePrice, double purchasePrice, String barCode) {
        this.setName(name);
        this.setDescription(description);
        this.setSalePrice(salePrice);
        this.setPurchasePrice(purchasePrice);
        this.setBarCode(barCode);
    }

    private boolean validadeBarCode(String barCode){
        //TODO implementar a validação do código de barras com REGEX
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() != 0 && name != null){
            this.name = name;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null){
            this.description = description;
        }
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        if (this.validadeBarCode(barCode)){
            this.barCode = barCode;
        }
    }
}
