package com.example.BD.domain;

import com.sun.istack.NotNull;
import javax.persistence.*;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class Workers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private String w_passport_data;

    @OneToOne
    @JoinColumn(name = "subsidiary_id")
    private Subsidiary subsidiary;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "position_id")
    private Positions positions;
    @NotNull
    private String w_phone_number;

    public Workers(String name, String surname, String w_passport_data,
                   Subsidiary subsidiary, Positions positions, String w_phone_number) {
        this.name = name;
        this.surname = surname;
        this.w_passport_data = w_passport_data;
        this.subsidiary = subsidiary;
        this.positions = positions;
        this.w_phone_number = w_phone_number;
    }

    public Workers() {
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

    public String getW_passport_data() {
        return w_passport_data;
    }

    public void setW_passport_data(String w_passport_data) {
        this.w_passport_data = w_passport_data;
    }

    public Subsidiary getSubsidiary() {
        return subsidiary;
    }

    public void setSubsidiary(Subsidiary subsidiary) {
        this.subsidiary = subsidiary;
    }

    public Positions getPositions() {
        return positions;
    }

    public void setPositions(Positions positions) {
        this.positions = positions;
    }

    public String getW_phone_number() {
        return w_phone_number;
    }

    public void setW_phone_number(String w_phone_number) {
        this.w_phone_number = w_phone_number;
    }
}
