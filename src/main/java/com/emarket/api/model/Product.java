package com.emarket.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

   private String name;
   private String description;
   private String photoSrc;
   private double stock;
   private double price;

   @ManyToOne(fetch = FetchType.LAZY)
   private ProducerAccount producerAccount;
}
