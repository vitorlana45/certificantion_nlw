package com.vitorlana.certificantion_nlw.modules.students.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // criando um construtor com todos os atributos
@NoArgsConstructor // criando um construtor vazio
@Entity(name = "answer-certifications_students")

public class AwnsersCertificationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // as colunas abaixo sao todas ForeignKey

    @Column(name = "certification_id",  insertable = false , updatable = false)
    private UUID certificatonID;

    @ManyToOne()
    @JoinColumn(name = "certification_id") 
    private CertificationStudentEntity certificationStudentEntity;

    @Column(name = "student_id")
    private UUID studentID;

    @ManyToOne
    @JoinColumn(name = "student_id",  insertable = false , updatable = false)
    private StudentEntity studentEntity;

    @Column(name = "question_id")
    private UUID questionID;

    @Column(name = "answer_id")
    private UUID answerID;

    @Column(name = "is_correct")
    private boolean isCorret;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
