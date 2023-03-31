package com.example.manager_product.repository.impl;

import com.example.manager_product.model.Product;
import com.example.manager_product.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ProductRepository implements IProductRepository {

//    static List<Product> productList = new ArrayList<>();
//
//    static {
//        productList.add(new Product(1, "Iphone7", "50", "blue", "Apple"));
//        productList.add(new Product(2, "Iphone8", "70", "white", "Apple"));
//        productList.add(new Product(3, "Iphone10", "90", "rose", "Apple"));
//        productList.add(new Product(4, "Iphone11", "110", "black", "Apple"));
//        productList.add(new Product(5, "Iphone12", "150", "green", "Apple"));
//    }

    @Override
    public List<Product> list() {
        List<Product> productList = BaseRepository.entityManager.createQuery("select s from Product as s").getResultList();
        return productList;
    }

    @Override
    public void add(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public Product seachById(int id) {
        Product product = BaseRepository.entityManager.find(Product.class, id);
        return product;
    }

    @Override
    public List<Product> seachByName(String name) {
        List<Product> productList = BaseRepository.entityManager
                .createQuery("select s from Product s where name =:name", Product.class)
                .setParameter("name", name).getResultList();
        return productList;
    }

    @Override
    public void update(int id, Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public void remove(int id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(seachById(id));
        entityTransaction.commit();
    }
}
