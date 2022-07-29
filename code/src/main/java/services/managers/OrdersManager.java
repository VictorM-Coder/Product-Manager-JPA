package services.managers;

import model.entities.orders.Order;
import model.enums.SortType;

import java.util.ArrayList;
import java.util.List;

public class OrdersManager implements Manager<Order>{
    private List<Order> orders;

    public OrdersManager(){
        this.orders = new ArrayList<>();
    }

    public OrdersManager(List<Order> orders){
        this();
        this.orders = orders;
    }


    @Override
    public void add(Order entity) {
        if (entity != null){
            this.orders.add(entity);
        }
    }

    @Override
    public Order remove(Order entity) {
        this.orders.remove(entity);
        return entity;
    }

    @Override
    public List<Order> getAll() {
        return this.orders;
    }

    @Override
    public Order getById(Long id) {
        for(Order order: this.orders){
            if (order.getId() == id){
                return order;
            }
        }
        return null;
    }

    @Override
    public List<Order> getBySort(SortType sortType) {
        return null;
    }
}
