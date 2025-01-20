package com.aulao10x.CadastroDeNinjas;
import jakarta.persistence.*;

// JPA = JAVA PERSISTER API

@Entity // ele transforma uma classe em uma entidade do BD
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // usa-se junto com o id para gerar automatico
    private Long id; // id so é declarado, o propio java incrementa
    private String nome;
    private String email;
    private int idade;

    public NinjaModel(){
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
