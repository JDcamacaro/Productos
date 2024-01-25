package com.productos.Controller;

import com.productos.Model.ProductModel;
import com.productos.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "productos")

public class ProductController {

    @Autowired
    ProductServices productServices;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ProductModel> GetAll(){
        return productServices.GetProduct();
    }

    @GetMapping(path = "{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ProductModel ProductId(@PathVariable(name = "id")Integer id){
        return productServices.IdProduct(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ProductModel ProductCreate(@RequestBody ProductModel productModel){
        return productServices.CreateProduct(productModel);
    }

    @DeleteMapping(path = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public void ProductDelete(@PathVariable(name = "id")Integer id){
        productServices.DeleteProduct(id);
    }
}
