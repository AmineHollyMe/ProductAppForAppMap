package test.app.emanager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "variant")
public class Variant {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private Boolean deleted;

    private String name;

    private Double price;

    @ManyToOne
    @JsonIgnore
    private Product product;

    public Variant() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
