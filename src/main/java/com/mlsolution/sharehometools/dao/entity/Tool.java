package com.mlsolution.sharehometools.dao.entity;

//import sun.jvm.hotspot.gc.shared.Generation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tool  {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private LocalDate buyDate;
    private double rentPrice;

    public Tool() {
    }

    public Tool(Long id, String name, LocalDate buyDate, double rentPrice) {
        this.id = id;
        this.name = name;
        this.buyDate = buyDate;
        this.rentPrice = rentPrice;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

}
