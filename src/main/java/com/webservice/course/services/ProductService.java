package com.webservice.course.services;

import com.webservice.course.entities.Product;
import com.webservice.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;


    public List<Product> findAll(){
        List<Product> products = repository.findAll();
        return products;
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
