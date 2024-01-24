package com.productos.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {

    @Id
    @Column

    Integer Id;
    String Marca;
    String Model;
    Integer Imei;
    Integer Falla;

}
