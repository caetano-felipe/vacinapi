package br.com.felipecaetano.vacinapratodos.vacinapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "cadastros")
public class CadastroAplicacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @NotEmpty(message = "Campo de nome da vacina não pode seer vazio!")
    private String nomeVacina;

    @NotNull
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataAplicacao;

    @ManyToOne
    @JsonIgnoreProperties("cadastros")
    private UsuarioModel usuarios;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public UsuarioModel getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(UsuarioModel usuarios) {
        this.usuarios = usuarios;
    }
}
