package com.cydeo.model;

import com.cydeo.enums.Gender;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name ="studentFirstName",length=14)
    private String firstName;
    //@Column(name ="studentLastName")
    private String lastName;
    private String email;

    @Transient
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthdate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthtime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
