package com.vitorlana.certificantion_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.vitorlana.certificantion_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service // toda a vez que tiver o @SERVICE significa que sera uma camada de serviço
public class VerifyIfHasCertificationUseCase {

    public boolean execute( VerifyHasCertificationDTO dto){
        if (dto.getEmail().equals("vitoresmerio00@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
            
        }
        return false;
    }


}
