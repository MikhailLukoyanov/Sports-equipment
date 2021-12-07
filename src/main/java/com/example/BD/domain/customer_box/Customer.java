package com.example.BD.domain.customer_box;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private String c_passport_data;
    private String c_phone_number;

    public Customer(String name, String surname, String c_passport_data, String c_phone_number) {
        this.name = name;
        this.surname = surname;
        this.c_passport_data = c_passport_data;
        this.c_phone_number = c_phone_number;
    }

    public Customer() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getC_passport_data() {
        return c_passport_data;
    }

    public void setC_passport_data(String c_passport_data) {
        this.c_passport_data = c_passport_data;
    }

    public String getC_phone_number() {
        return c_phone_number;
    }

    public void setC_phone_number(String c_phone_number) {
        this.c_phone_number = c_phone_number;
    }
}
