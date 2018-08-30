package com.hamid.service;

import com.hamid.model.Product;
import com.hamid.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/** 
 * Service layer.
 * Specify transactional behavior and mainly
 * delegate calls to Repository.
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    //@Transactional(readOnly=true)
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    //@Transactional
    public void addAll(Collection<Product> products) {
        for (Product product : products) {
            productRepository.save(product);
        }
    }

    //TODO why is not active: @Transactional(readOnly=true)
    public List<Product> findByNameIs(String name) {
        return productRepository.findByNameIs(name);
    }

    //@Transactional(readOnly=true)
    public List<Product> findByNameContainingIgnoreCase(String searchString) {
        return productRepository.findByNameContainingIgnoreCase(searchString);
    }



}
