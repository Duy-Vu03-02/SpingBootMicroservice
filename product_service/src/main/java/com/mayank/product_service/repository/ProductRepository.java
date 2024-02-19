package com.mayank.product_service.repository;

import com.mayank.product_service.modal.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
