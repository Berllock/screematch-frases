package br.com.project.sreenmatch_frases.service;

import br.com.project.sreenmatch_frases.dto.FraseDTO;
import br.com.project.sreenmatch_frases.model.Frase;
import br.com.project.sreenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.findById(4L).get();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
