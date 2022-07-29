package services.managers;

import model.entities.products.StockProduct;
import model.enums.SortType;

import java.util.ArrayList;
import java.util.List;

public class StockManager implements Manager<StockProduct>{
    private List<StockProduct> stockProducts;

    public StockManager(){
        this.stockProducts = new ArrayList<>();
    }

    public StockManager(List<StockProduct> stockManagers){
        this();
        this.stockProducts = stockManagers;
    }

    @Override
    public void add(StockProduct entity) {
        if(entity != null){
            this.stockProducts.add(entity);
        }
    }

    @Override
    public StockProduct remove(StockProduct entity) {
        this.stockProducts.remove(entity);
        return entity;
    }

    @Override
    public List<StockProduct> getAll() {
        return this.stockProducts;
    }

    @Override
    public StockProduct getById(Long id) {
        for(StockProduct stockProduct: this.stockProducts){
            if (stockProduct.getId() == id){
                return stockProduct;
            }
        }
        return null;
    }

    @Override
    public List<StockProduct> getBySort(SortType sortType) {
        return null;
    }
}
