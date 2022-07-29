package model.entities.orders;

import model.entities.Entity;
import model.entities.clients.Client;
import model.entities.products.Product;
import model.entities.products.StockProduct;
import model.enums.SortType;
import services.managers.Manager;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@javax.persistence.Entity
@Table(name = "orders")
public class Order extends Entity implements Manager<Product> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;

    @OneToMany(cascade = CascadeType.ALL)
    private List<StockProduct> stockProducts;

    public Order(){

    }
    
    public Order(Client client){
        this.setClient(client);
        this.stockProducts = new ArrayList<>();
    }

    public Order(Client client, List<StockProduct> stockProducts){
        this(client);
        this.stockProducts = stockProducts;
    }

    @Override
    public void add(Product entity) {

    }

    @Override
    public Product remove(Product entity) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(Long id) {
        return null;
    }

    @Override
    public List<Product> getBySort(SortType sortType) {
        return null;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<StockProduct> getStockProducts() {
        return this.stockProducts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
