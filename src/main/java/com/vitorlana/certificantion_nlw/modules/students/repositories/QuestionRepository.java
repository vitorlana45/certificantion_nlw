package com.vitorlana.certificantion_nlw.modules.students.repositories;

import com.vitorlana.certificantion_nlw.modules.students.questions.entities.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository 
public interface QuestionRepository extends JpaRepository<QuestionEntity, UUID> { // Interface, não classe

    List<QuestionEntity> findByTechnology(String technology);
    
    
}
