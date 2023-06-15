package com.mogli.mealroulette.recipies;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecipyController {
    private final RecipyService recipyService;

    @GetMapping("recipy/{id}")
    public RecipyDto getRecipyById(@PathVariable Long id) {
        return recipyService.getRecipyById(id);
    }

    @GetMapping("recipies")
    public List<RecipyDto> getRecipies(@RequestParam Integer entriesPerPage, @RequestParam Integer page) {
        return recipyService.getRecipies(entriesPerPage, page);
    }

    @GetMapping("minimumEndpoints/recipies")
    public List<RecipyDtoBareMinimum> getBareMinimumRecipies(@RequestParam Integer entriesPerPage, @RequestParam Integer page) {
        return recipyService.getBareMinimunRecipyInfo(entriesPerPage, page);
    }

    @GetMapping("recipies/count")
    public Long getRecipyCount() {
        return recipyService.getCountOfRecipies();
    }
}
