package com.example.BD.domain.return_box;

import javax.persistence.*;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class Protocol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String p_number;
    private String reason;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fine_id")
    private FinePriceList finePriceList;

    public Protocol(String p_number, String reason, FinePriceList finePriceList) {
        this.p_number = p_number;
        this.reason = reason;
        this.finePriceList = finePriceList;
    }

    public Protocol() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getP_number() {
        return p_number;
    }

    public void setP_number(String p_number) {
        this.p_number = p_number;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public FinePriceList getFinePriceList() {
        return finePriceList;
    }

    public void setFinePriceList(FinePriceList finePriceList) {
        this.finePriceList = finePriceList;
    }
}
