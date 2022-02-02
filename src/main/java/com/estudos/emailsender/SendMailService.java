package com.estudos.emailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendMailService {
    @Autowired
    private JavaMailSender mailSender;

    public void enviar(Email emailEnvio) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("seu email");
        email.setSubject("Mensagem de "+emailEnvio.getNome()+" via blog");
        email.setText(emailEnvio.getMensagem()+" Contato para retorno: "+emailEnvio.getEmail());
        mailSender.send(email);
    }

    }
