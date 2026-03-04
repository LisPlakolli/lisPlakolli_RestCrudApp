package com.mthree.StudentDB.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    /*
    ID will be the primary key of the table
     */
    @Id
    private Long id;
    private String name;
    private Double fees;
    private String subName;

    public Student() {
    }

    //Constructor for Student object
    public Student(Long id, String name, Double fees, String subName) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.subName = subName;
    }

    //ID getter
    public Long getId() {
        return id;
    }

    //ID setter
    public void setId(Long id) {
        this.id = id;
    }

    //Name getter
    public String getName() {
        return name;
    }

    //Name setter
    public void setName(String name) {
        this.name = name;
    }

    //Fees getter
    public Double getFees() {
        return fees;
    }

    //Fees setter
    public void setFees(Double fees) {
        this.fees = fees;
    }

    //Subject getter
    public String getSubName() {
        return subName;
    }

    //Subject setter
    public void setSubName(String subName) {
        this.subName = subName;
    }
}