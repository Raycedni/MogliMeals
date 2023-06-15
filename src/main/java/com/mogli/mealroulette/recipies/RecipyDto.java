package com.mogli.mealroulette.recipies;

import com.mogli.mealroulette.LinkDto;
import com.mogli.mealroulette.ingridients.IngredientDto;
import com.mogli.mealroulette.tags.TagDto;
import com.mogli.microservicebase.commons.Dto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecipyDto implements Dto {
    private Long id;
    private String bez;
    private Integer status;
    private Double kcal;
    private List<LinkDto> tags;
    private List<LinkDto> ingredients;
    @Setter(AccessLevel.NONE)
    @JsonIgnore
    private Embedded embedded = new Embedded();


    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Embedded {
        private List<IngredientDto> ingredients;
        private List<TagDto> tags;
    }
}
