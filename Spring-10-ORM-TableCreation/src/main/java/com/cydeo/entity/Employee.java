package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // needs always primary key
public class Employee {

    @Id
    private int id;
    private String name;
}
