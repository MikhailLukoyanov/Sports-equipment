package com.example.BD.domain.goods;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class Suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name_supplier;
    private Long agreement_number;

    public Suppliers(String name_supplier, Long agreement_number) {
        this.name_supplier = name_supplier;
        this.agreement_number = agreement_number;
    }

    public Suppliers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_supplier() {
        return name_supplier;
    }

    public void setName_supplier(String name_supplier) {
        this.name_supplier = name_supplier;
    }

    public Long getAgreement_number() {
        return agreement_number;
    }

    public void setAgreement_number(Long agreement_number) {
        this.agreement_number = agreement_number;
    }
}
