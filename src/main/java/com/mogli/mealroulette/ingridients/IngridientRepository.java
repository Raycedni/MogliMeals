package com.mogli.mealroulette.ingridients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(exported = false)
public interface IngridientRepository extends JpaRepository<IngredientEntity, Long> {
}
