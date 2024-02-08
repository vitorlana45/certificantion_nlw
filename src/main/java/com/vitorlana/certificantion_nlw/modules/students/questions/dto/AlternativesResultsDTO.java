package com.vitorlana.certificantion_nlw.modules.students.questions.dto;

import java.util.List;
import java.util.UUID;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlternativesResultsDTO {
    
    private UUID id;
    private String description;
    private String decription;

    private List<AlternativesResultsDTO> alternatives;



}
