package model.entities.orders;

import model.entities.Entity;
import model.entities.clients.Client;
import model.entities.products.Product;

import java.util.ArrayList;
import java.util.List;

//TODO implementar a classe Manager
public class Order extends Entity {
    private Client client;
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
