package com.example.BD.domain.customer_box;

import com.example.BD.domain.Workers;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class Discharge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "worker_id")
    private Workers worker;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_cart_id")
    private CustomerCart customerCart;

    private int total_price;

    public Discharge(Date date, Workers worker, CustomerCart customerCart, int total_price) {
        this.date = date;
        this.worker = worker;
        this.customerCart = customerCart;
        this.total_price = total_price;
    }

    public Discharge() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Workers getWorker() {
        return worker;
    }

    public void setWorker(Workers worker) {
        this.worker = worker;
    }

    public CustomerCart getCustomerCart() {
        return customerCart;
    }

    public void setCustomerCart(CustomerCart customerCart) {
        this.customerCart = customerCart;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
}
