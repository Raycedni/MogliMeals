package com.mogli.mealroulette;

import com.mogli.mealroulette.recipies.RecipyEntityRepository;
import com.mogli.microservicebase.lifecycle.MogliApp;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class MealrouletteApplication implements CommandLineRunner {
    private final RecipyEntityRepository repository;

    public static void main(String[] args) {
        new MogliApp().setup(MealrouletteApplication.class).run(args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(repository.save(new Recipy(1L, "test", 1)));
    }
}
