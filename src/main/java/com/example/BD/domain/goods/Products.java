package com.example.BD.domain.goods;

import com.example.BD.domain.Subsidiary;

import javax.persistence.*;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_name_id")
    private ProductName productName;

    private String article;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "price_id")
    private PriceList priceList;

    private boolean existence;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subsidiary_id")
    private Subsidiary subsidiary;

    public Products(ProductName productName, String article, PriceList priceList, boolean existence, Subsidiary subsidiary) {
        this.productName = productName;
        this.article = article;
        this.priceList = priceList;
        this.existence = existence;
        this.subsidiary = subsidiary;
    }

    public Products() {
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

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }

    public boolean isExistence() {
        return existence;
    }

    public void setExistence(boolean existence) {
        this.existence = existence;
    }

    public Subsidiary getSubsidiary() {
        return subsidiary;
    }

    public void setSubsidiary(Subsidiary subsidiary) {
        this.subsidiary = subsidiary;
    }
}
