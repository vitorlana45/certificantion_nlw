package com.vitorlana.certificantion_nlw.modules.students.questions.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitorlana.certificantion_nlw.modules.students.questions.dto.AlternativesResultsDTO;
import com.vitorlana.certificantion_nlw.modules.students.questions.dto.QuestionResultDTO;
import com.vitorlana.certificantion_nlw.modules.students.questions.entities.QuestionEntity;
import com.vitorlana.certificantion_nlw.modules.students.repositories.QuestionRepository;
import com.vitorlana.certificantion_nlw.modules.students.questions.entities.AlternativeEntity;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/technology/{technology}")
    public List<QuestionResultDTO> findByTechnology(@PathVariable String technology) {

        System.out.println("tec " + technology);

        var result = this.questionRepository.findByTechnology(technology);

        var toMap = result.stream().map(question -> mapQuestionToDTO(question))
                .collect(Collectors.toList());

        return toMap;
    }

    static QuestionResultDTO mapQuestionToDTO(QuestionEntity question) {
        var questionResultDTO = QuestionResultDTO.builder()
                .id(question.getId())
                .technology(question.getTechnology())
                .description(question.getDescription())
                .build();

        List<AlternativesResultsDTO> alternativesResultsDTOs = question.getAlternatives()
                .stream()
                .map(alternative -> mapAlternativeToDTO(alternative))
                .collect(Collectors.toList());

        questionResultDTO.setAlternatives(alternativesResultsDTOs);
        return questionResultDTO;
    }

    static AlternativesResultsDTO mapAlternativeToDTO(AlternativeEntity alternative) {
        return AlternativesResultsDTO.builder()
                .id(alternative.getId())
                .description(alternative.getDescription())
                .build();
    }
    
}
