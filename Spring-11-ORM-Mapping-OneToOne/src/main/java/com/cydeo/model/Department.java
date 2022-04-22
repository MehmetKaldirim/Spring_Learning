package com.cydeo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="departments")
@Data
@NoArgsConstructor
public class Department extends BaseEntity{


    String department;
    String division;
    @OneToOne(mappedBy = "department")
    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }


}
