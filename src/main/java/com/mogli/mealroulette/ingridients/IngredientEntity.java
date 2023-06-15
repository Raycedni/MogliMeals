package com.mogli.mealroulette.ingridients;

import com.mogli.mealroulette.recipies.RecipyToIngridientEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "ingredients")
public class IngredientEntity implements com.mogli.microservicebase.commons.Entity {
    @Id
    @GeneratedValue
    private Long id;
    protected String bez;
    protected Integer status;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "ingredient")
    protected List<RecipyToIngridientEntity> usedInRecipies;

    public static String getType() {
        return "IngridientEntity";
    }
}
