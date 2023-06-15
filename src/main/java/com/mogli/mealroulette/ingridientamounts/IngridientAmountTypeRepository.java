package com.mogli.mealroulette.ingridientamounts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(exported = false)
public interface IngridientAmountTypeRepository extends JpaRepository<IngridientAmountTypeEntity, Long> {
}
