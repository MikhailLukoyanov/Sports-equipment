package com.example.BD.domain.return_box;

import com.example.BD.domain.Workers;
import com.example.BD.domain.customer_box.Discharge;
import com.example.BD.domain.customer_box.Customer;
import com.example.BD.domain.goods.Products;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class ReturnItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "check_id")
    private Discharge check;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "worker_id")
    private Workers worker;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Products product;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "protocol_id")
    private Protocol protocol;

    private Date data_fact;

    public ReturnItem(Discharge check, Customer customer, Workers worker, Products product, Protocol protocol, Date data_fact) {
        this.check = check;
        this.customer = customer;
        this.worker = worker;
        this.product = product;
        this.protocol = protocol;
        this.data_fact = data_fact;
    }

    public ReturnItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Discharge getCheck() {
        return check;
    }

    public void setCheck(Discharge check) {
        this.check = check;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Workers getWorker() {
        return worker;
    }

    public void setWorker(Workers worker) {
        this.worker = worker;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public Date getData_fact() {
        return data_fact;
    }

    public void setData_fact(Date data_fact) {
        this.data_fact = data_fact;
    }
}
