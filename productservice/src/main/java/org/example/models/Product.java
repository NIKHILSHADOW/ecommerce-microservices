package org.example.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Time;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;

    private String description;

    private Boolean inStock;

    private Double price;

    // to be included
//    @ManyToOne
//    private Integer categoryId;

    @CreationTimestamp
    private Time creationTime;

    @UpdateTimestamp
    private Time updationTime;
}
