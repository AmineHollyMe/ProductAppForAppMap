package test.app.emanager.model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;

    private Boolean deleted = false;

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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

}
