package com.estudos.emailsender;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Email {
    private String email;
    private String nome;
    private String mensagem;

    public Email() {
    }

    public Email(String email, String nome, String mensagem) {
        this.email = email;
        this.nome = nome;
        this.mensagem = mensagem;
    }
}
