package tests;

import jpa.JPA;
import model.entities.clients.Client;
import model.entities.orders.Order;
import model.entities.products.Product;
import model.entities.products.StockProduct;

public class Test {
    public static void main(String[] args) {
        JPA<Client> jpa = new JPA<Client>(Client.class);
        Client client = new Client("olivier", "222-222-222-12");
        jpa.persist(client);
        jpa.close();
    }
}
