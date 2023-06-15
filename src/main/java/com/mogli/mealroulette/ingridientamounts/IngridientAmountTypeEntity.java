package com.mogli.mealroulette.ingridientamounts;

import com.mogli.mealroulette.recipies.RecipyToIngridientEntity;
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
@Table(name = "ingridient_amounttype")
public class IngridientAmountTypeEntity implements com.mogli.microservicebase.commons.Entity {
    @Id
    @GeneratedValue
    private Long id;
    protected String bez;
    protected Integer status;

    @OneToMany(mappedBy = "amountType")
    private List<RecipyToIngridientEntity> usedInRecipies;

    public static String getType() {
        return "AmountTypeEntity";
    }
}
