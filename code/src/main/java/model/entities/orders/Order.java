package model.entities.orders;

import model.entities.Entity;
import model.entities.clients.Client;
import model.entities.products.Product;
import model.enums.SortType;
import services.managers.Manager;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

public class Order extends Entity implements Manager<Product> {
    @Column(nullable = false)
    private Client client;

    @Column(nullable = false)
    private List<Product> products;

    public Order(){

    }
    
    public Order(Client client){
        this.setClient(client);
        this.products = new ArrayList<>();
    }

    public Order(Client client, List<Product> products){
        this(client);
        this.products = products;
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

    public List<Product> getProducts() {
        return products;
    }
}
