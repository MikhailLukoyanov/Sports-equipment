package com.example.BD.domain.goods;

import javax.persistence.*;

/**
 * @author Mikhail Lukoyanov
 */
@Entity
public class NewArsenal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_name_id")
    private ProductName productName;

    private int quantity;
    private int price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "suppliers_id")
    private Suppliers suppliers;

    public NewArsenal() {
    }

    public NewArsenal(ProductName productName, int quantity, int price, Suppliers suppliers) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.suppliers = suppliers;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }
}
