package com.vitorlana.certificantion_nlw.modules.students.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor // criando um construtor com todos os atributos
@NoArgsConstructor // criando um construtor vazio

public class AwnsersCertificationsEntity {
    
    private UUID id;
    private UUID certificatonID;
    private UUID studentID;
    private UUID questionID;
    private UUID answerID;
    private boolean isCorret;

}
