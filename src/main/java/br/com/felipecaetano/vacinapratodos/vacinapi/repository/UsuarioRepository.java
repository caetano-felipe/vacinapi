package br.com.felipecaetano.vacinapratodos.vacinapi.repository;

import br.com.felipecaetano.vacinapratodos.vacinapi.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
