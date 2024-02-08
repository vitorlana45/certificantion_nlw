package com.vitorlana.certificantion_nlw.modules.students.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vitorlana.certificantion_nlw.modules.students.entities.CertificationStudentEntity;

@Repository // nao precisa de identificar pois a classe ta extendendo p JPA RESPOSITORY a classe entendera que e um repositorio
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID> {

    @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
    List<CertificationStudentEntity> findByStudentEmailAndTechnoLogy (String email, String technology);



}
