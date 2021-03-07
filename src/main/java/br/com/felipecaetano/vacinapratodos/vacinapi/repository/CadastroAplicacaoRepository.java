package br.com.felipecaetano.vacinapratodos.vacinapi.repository;

import br.com.felipecaetano.vacinapratodos.vacinapi.model.CadastroAplicacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroAplicacaoRepository extends JpaRepository<CadastroAplicacaoModel, Long> {
}
