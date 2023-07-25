package com.jose.backend.cartapp.backendcartapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jose.backend.cartapp.backendcartapp.models.entities.Product;
import com.jose.backend.cartapp.backendcartapp.services.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
  
  @Autowired
  private ProductService service ;

  @GetMapping("/products")
  public List<Product>  List(){
    return service.findAll();
  }

}
