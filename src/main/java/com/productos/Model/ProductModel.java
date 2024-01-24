package com.productos.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductModel {

    @Id
    @Column

    Integer Id;
    String Marca;
    String Model;
    Integer Imei;
    Integer Falla;

}
