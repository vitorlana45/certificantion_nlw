package com.vitorlana.certificantion_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitorlana.certificantion_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.vitorlana.certificantion_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;


@RestController
@RequestMapping("/students")

// DTO DATA TRANSFER OBJECT
public class StudentController {

    // Preciso usar o meu USECASE
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyIfHasCertificationDTO){ // oque eu tiver na frente do REQUESTBODY vai ser o OBJETO QUE eu Vou recerber dentro de um JSON  

        var result = this.verifyIfHasCertificationUseCase.execute(verifyIfHasCertificationDTO);
     
        if(result){
           return "usuário ja fez a prova";
        }

        return "Usuario pode fazer a prova";

    }
}
