package com.jose.backend.cartapp.backendcartapp.services;

import java.util.List;

import com.jose.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {
  List<Product> findAll();
}
