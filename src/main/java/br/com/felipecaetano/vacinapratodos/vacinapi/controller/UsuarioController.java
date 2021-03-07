package br.com.felipecaetano.vacinapratodos.vacinapi.controller;

import br.com.felipecaetano.vacinapratodos.vacinapi.model.UsuarioModel;
import br.com.felipecaetano.vacinapratodos.vacinapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public ResponseEntity<UsuarioModel> postUsuario(@Valid @RequestBody UsuarioModel usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
    }
}
