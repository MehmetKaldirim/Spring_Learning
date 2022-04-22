package com.cydeo.model;


import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="payments")
@Data
@NoArgsConstructor
public class Payment extends BaseEntity{





    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;

    private BigDecimal amount;


    @Enumerated(EnumType.STRING)
    private Status paymentStatus;


    @OneToOne(cascade = CascadeType.ALL)//it is one way we can separate it
    //@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="payment_detail_id")
    private PaymentDetail paymentDetail;

    @ManyToOne()//it is one way we can separate it
    //@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="merchant")
    private Merchant merchant;

    @ManyToOne()//it is one way we can separate it
    //@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="customer")
    private Customer customer;

    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
