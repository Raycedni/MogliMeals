package com.mogli.mealroulette.tags;

import com.mogli.mealroulette.recipies.RecipyEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "tags")
public class TagEntity implements com.mogli.microservicebase.commons.Entity {
    @Id
    @GeneratedValue
    private Long id;
    private String bez;
    private Integer status;

    @ManyToMany
    @JoinTable(
            name = "recipies_tags",
            joinColumns = {@JoinColumn(name = "id_tag")},
            inverseJoinColumns = {@JoinColumn(name = "id_recipy")}
    )
    private List<RecipyEntity> taggedRecipies;
}
