package br.com.project.sreenmatch_frases.repository;

import br.com.project.sreenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
}
