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
@Table(name = "exposure")
public class Exposure extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "exposures")
    private Set<Plant> plants = new HashSet<>();

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exposure)) return false;
        if (!super.equals(o)) return false;
        Exposure exposure = (Exposure) o;
        return Objects.equals(name, exposure.name) &&
                Objects.equals(plants, exposure.plants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, plants);
    }
}
