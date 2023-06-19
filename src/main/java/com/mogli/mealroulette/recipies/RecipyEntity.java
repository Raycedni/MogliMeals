package com.mogli.mealroulette.recipies;

import com.mogli.mealroulette.tags.TagEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "recipies")
public class RecipyEntity implements com.mogli.microservicebase.commons.Entity {
    @Id
    @GeneratedValue
    private Long id;
    private String bez;
    private Integer status;

    @JsonIgnore
    @ManyToMany(mappedBy = "taggedRecipies")
    private List<TagEntity> tags;
    @JsonIgnore

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "recipy")
    private List<RecipyToIngridientEntity> usedIngridients;

    public static String getType() {
        return "RecipyEntity";
    }
}
