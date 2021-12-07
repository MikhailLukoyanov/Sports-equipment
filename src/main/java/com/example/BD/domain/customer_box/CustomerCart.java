package com.example.BD.domain.customer_box;

import com.example.BD.domain.goods.Products;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class CustomerCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Products products;

    private int c_quantity;
    private Date date_lease_start;
    private Date data_lease_end;

    public CustomerCart(Customer customer, Products products, int c_quantity, Date date_lease_start, Date data_lease_end) {
        this.customer = customer;
        this.products = products;
        this.c_quantity = c_quantity;
        this.date_lease_start = date_lease_start;
        this.data_lease_end = data_lease_end;
    }

    public CustomerCart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public int getC_quantity() {
        return c_quantity;
    }

    public void setC_quantity(int c_quantity) {
        this.c_quantity = c_quantity;
    }

    public Date getDate_lease_start() {
        return date_lease_start;
    }

    public void setDate_lease_start(Date date_lease_start) {
        this.date_lease_start = date_lease_start;
    }

    public Date getData_lease_end() {
        return data_lease_end;
    }

    public void setData_lease_end(Date data_lease_end) {
        this.data_lease_end = data_lease_end;
    }
}
