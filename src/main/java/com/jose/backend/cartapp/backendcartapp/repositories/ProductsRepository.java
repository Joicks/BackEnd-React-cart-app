package com.jose.backend.cartapp.backendcartapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.jose.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductsRepository extends CrudRepository <Product, Long> {
  
}
