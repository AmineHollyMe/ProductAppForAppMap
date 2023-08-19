package test.app.emanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;


    private String name;

    private Boolean deleted;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy="product", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Variant> variant;

    public Product(Long id) {
        this.id = id;
    }

    public Product() {}

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Variant> getVariant() {
        return variant;
    }

    public void setVariant(Set<Variant> variant) {
        this.variant = variant;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
