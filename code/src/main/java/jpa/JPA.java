package jpa;

import model.entities.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.function.Consumer;

public class JPA <E extends Entity>{
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("product-manager");
    private EntityManager entityManager;
    private Class<E> eClass;

    public JPA(Class<E> eClass){
        this.eClass = eClass;
        this.entityManager = JPA.factory.createEntityManager();
    }

    public E persist(E entity){
        Consumer<E> consumer = (e) -> {
            this.entityManager.persist(e);
        };

        return this.transaction(entity, consumer);
    }

    public E remove(E entity){
        Consumer<E> consumer = (e) -> {
            this.entityManager.remove(e);
        };

        return this.transaction(entity, consumer);
    }

    public void close(){
        this.entityManager.close();
    }

    private E transaction(E entity, Consumer consumer){
        try {
            this.entityManager.getTransaction().begin();
            consumer.accept(entity);
            this.entityManager.getTransaction().commit();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return entity;
    }
}















