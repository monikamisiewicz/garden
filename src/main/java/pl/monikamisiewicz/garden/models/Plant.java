package pl.monikamisiewicz.garden.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "plant")
public class Plant extends AbstractEntity {

    @NotNull
    @Min(value = 2, message = "Nazwa musi mieć min. 2 znaki")
    @Column(name = "name")
    private String name;

    @Column(name = "soil")
    private String soil;

    @Column(name = "humidity")
    private String humidity;

    //pokrój
    @Column(name = "structure")
    private String structure;

    @Column(name = "flowers")
    private String flowers;

    @Column(name = "leaves")
    private String leaves;

    //docelowa wysokość w m
    @Column(name = "size")
    private String size;

    @Column(name = "description")
    private String description;

    //uprawa
    @Column(name = "cultivation")
    private String cultivation;

    @NotNull
    @ManyToMany
    @JoinTable(name = "plant_categories",
            joinColumns = @JoinColumn(name = "plant_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "plant_exposures",
            joinColumns = @JoinColumn(name = "plant_id"),
            inverseJoinColumns = @JoinColumn(name = "exposure_id"))
    private Set<Exposure> exposures = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "plant_bloomtimes",
            joinColumns = @JoinColumn(name = "plant_id"),
            inverseJoinColumns = @JoinColumn(name = "bloomtime_id"))
    private Set<BloomTime> bloomTimes = new HashSet<>();

    @NotNull
    @ManyToOne
    private Status status;

}
