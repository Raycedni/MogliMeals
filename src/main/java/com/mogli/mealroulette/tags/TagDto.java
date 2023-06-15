package com.mogli.mealroulette.tags;

import com.mogli.microservicebase.commons.Dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class TagDto implements Dto {
    private Long id;
    private String bez;
    private Integer status;
}
