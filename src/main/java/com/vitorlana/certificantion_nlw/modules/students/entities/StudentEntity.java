package com.vitorlana.certificantion_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentEntity {

    private UUID id; // Identificador Universal unico UUID
    private String email;
    private List<CertificationStudentEntity> certificationStudentEntity;

}
