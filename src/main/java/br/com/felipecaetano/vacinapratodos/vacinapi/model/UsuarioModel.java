package br.com.felipecaetano.vacinapratodos.vacinapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @NotEmpty(message = "Campo de nome não pode ser vazio!")
    private String nome;

    @Column(unique = true)
    @NotNull
    @NotEmpty(message = "Campo de e-mail não pode ser vazio!")
    @Email
    private String email;

    @Column(unique = true)
    @NotNull
    @NotEmpty(message = "Campo de CPF não pode ser vazio!")
    private String cpf;

    @NotNull
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataNascimento;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data = new java.sql.Date(System.currentTimeMillis());

    @OneToMany(mappedBy = "usuarios", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("usuarios")
    private List<CadastroAplicacaoModel> cadastros;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<CadastroAplicacaoModel> getCadastros() {
        return cadastros;
    }

    public void setCadastros(List<CadastroAplicacaoModel> cadastros) {
        this.cadastros = cadastros;
    }
}
