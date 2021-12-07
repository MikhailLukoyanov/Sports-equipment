package com.example.BD.domain.goods;

import javax.persistence.*;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class PriceList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_name_id")
    private ProductName productName;

    private String price_period;
    private int price;

    public PriceList(ProductName productName, String price_period, int price) {
        this.productName = productName;
        this.price_period = price_period;
        this.price = price;
    }

    public PriceList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductName getProductName() {
        return productName;
    }

    public void setProductName(ProductName productName) {
        this.productName = productName;
    }

    public String getPrice_period() {
        return price_period;
    }

    public void setPrice_period(String price_period) {
        this.price_period = price_period;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
