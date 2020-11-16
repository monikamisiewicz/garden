package pl.monikamisiewicz.garden.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category extends AbstractEntity {

    @Column(name = "name")
    private String name;

//    @ManyToMany(mappedBy = "categories")
//    private Set<Plant> plants = new HashSet<>();
//
    @Override
    public String toString() {
        return this.name;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Category)) return false;
//        if (!super.equals(o)) return false;
//        Category category = (Category) o;
//        return Objects.equals(name, category.name) &&
//                Objects.equals(plants, category.plants);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), name, plants);
//    }
}
