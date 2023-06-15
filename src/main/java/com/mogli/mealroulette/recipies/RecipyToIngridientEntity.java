package com.mogli.mealroulette.recipies;

import com.mogli.mealroulette.ingridientamounts.IngridientAmountTypeEntity;
import com.mogli.mealroulette.ingridients.IngredientEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "recipies_ingridients")
public class RecipyToIngridientEntity {
    @ManyToOne
    @JoinColumn(name = "ID_recipy", referencedColumnName = "ID")
    @Id
    private RecipyEntity recipy;
    @ManyToOne
    @JoinColumn(name = "ID_ingridient", referencedColumnName = "ID")
    @Id
    private IngredientEntity ingredient;
    @ManyToOne()
    @JoinColumn(name = "ID_amounttype", referencedColumnName = "ID")
    private IngridientAmountTypeEntity amountType;
    private Long amountUsed;

    public static String getType() {
        return "RecipyToIngridientEntity";
    }
}
