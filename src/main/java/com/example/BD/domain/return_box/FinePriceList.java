package com.example.BD.domain.return_box;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class FinePriceList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name_fine;
    private Long price;

    public FinePriceList(String name_fine, Long price) {
        this.name_fine = name_fine;
        this.price = price;
    }

    public FinePriceList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_fine() {
        return name_fine;
    }

    public void setName_fine(String name_fine) {
        this.name_fine = name_fine;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
