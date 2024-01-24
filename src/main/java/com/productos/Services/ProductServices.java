package com.productos.Services;


import com.productos.Model.ProductModel;
import com.productos.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServices {

    @Autowired
    ProductRepository productRepository;

    public ProductServices(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<ProductModel> GetProduct(){
        return productRepository.findAll();
    }

    public ProductModel IdProduct(Integer id){
        return productRepository.getReferenceById(id);
    }

    public ProductModel CreateProduct(ProductModel productModel){
        return productRepository.save(productModel);
    }

    public void DeleteProduct(Integer id){
        productRepository.deleteById(id);
    }
}

