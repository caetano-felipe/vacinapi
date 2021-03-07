package br.com.felipecaetano.vacinapratodos.vacinapi.controller;

import br.com.felipecaetano.vacinapratodos.vacinapi.model.CadastroAplicacaoModel;
import br.com.felipecaetano.vacinapratodos.vacinapi.repository.CadastroAplicacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cadastros")
public class CadastroAplicacaoController {

    @Autowired
    private CadastroAplicacaoRepository repository;

    @PostMapping
    public ResponseEntity<CadastroAplicacaoModel> postCadastro(@Valid @RequestBody CadastroAplicacaoModel cadastro) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cadastro));
    }
}
