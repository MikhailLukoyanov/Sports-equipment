package com.example.BD.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class Positions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name_position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_position() {
        return name_position;
    }

    public void setName_position(String name_position) {
        this.name_position = name_position;
    }
}
