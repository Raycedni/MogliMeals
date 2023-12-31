package com.mogli.mealroulette.recipies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(exported = false)
public interface RecipyEntityRepository extends JpaRepository<RecipyEntity, Long> {
}
