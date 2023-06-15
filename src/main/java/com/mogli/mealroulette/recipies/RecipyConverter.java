package com.mogli.mealroulette.recipies;

import com.ifa12b_gruppe1.klasseninfo.commons.ConverterForSimpleFields;
import com.mogli.microservicebase.commons.Converter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipyConverter extends ConverterForSimpleFields<RecipyEntity, RecipyDto> implements Converter<RecipyEntity, RecipyDto> {

    @Override
    public RecipyDto convertToDto(RecipyEntity source, RecipyDto target) {
        target = super.convertBetweenSourceAndTarget(source, target);

        return target;
    }

    @Override
    public RecipyEntity convertToEntity(RecipyDto source, RecipyEntity target) {
        target = super.convertBetweenSourceAndTarget(source, target);

        return target;
    }
}
