package com.mogli.mealroulette.recipies;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipyService {
    private final RecipyEntityRepository recipyEntityRepository;
    private final RecipyConverter recipyConverter;

    public RecipyDto getRecipyById(Long id) {
        return recipyConverter.convertToDto(
                recipyEntityRepository.findById(id).orElseThrow(), RecipyDto::new
        );
    }

    public List<RecipyDto> getRecipies(Integer entriesPerPage, Integer page) {
        return recipyConverter.convertToDto(
                recipyEntityRepository.findAll(PageRequest.of(page, entriesPerPage)).getContent(),
                RecipyDto::new
        );
    }

    public Long getCountOfRecipies() {
        return recipyEntityRepository.count();
    }

    public List<RecipyDtoBareMinimum> getBareMinimunRecipyInfo(Integer entriesPerPage, Integer page) {
        return recipyEntityRepository.findAll(PageRequest.of(page, entriesPerPage)).getContent().stream()
                .map(recipyEntity -> new RecipyDtoBareMinimum(recipyEntity.getId(), recipyEntity.getBez()))
                .toList();
    }
}
