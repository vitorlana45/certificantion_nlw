package com.vitorlana.certificantion_nlw.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitorlana.certificantion_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.vitorlana.certificantion_nlw.modules.students.repositories.CertificationStudentRepository;

@Service // toda a vez que tiver o @SERVICE significa que sera uma camada de serviço
public class VerifyIfHasCertificationUseCase {

    @Autowired  // usando um componente que e gerenciado pelo Spring coloca Autowired passando o componente em seguida
    private CertificationStudentRepository certificationStudentRepository;

    public boolean execute( VerifyHasCertificationDTO dto){
      var result = this.certificationStudentRepository.findByStudentEmailAndTechnoLogy(dto.getEmail(), dto.getTechnology());
        if (!result.isEmpty()) {
            return true; 
        }
        return false;
    }
}
