package com.productos.Repository;

import com.productos.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
}
