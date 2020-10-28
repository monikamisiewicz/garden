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
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bloom_time")
public class BloomTime extends AbstractEntity {

    @Column(name = "month")
    private String month;

    @ManyToMany(mappedBy = "bloomTimes")
    private Set<Plant> plants = new HashSet<>();

    @Override
    public String toString() {
        return "BloomTime{" +
                "month='" + month + '\'' +
                '}';
    }
}
