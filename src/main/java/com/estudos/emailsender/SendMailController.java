package com.estudos.emailsender;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SendMailController {
  private final SendMailService service;


    public SendMailController(SendMailService service) {
        this.service = service;
    }

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody Email dados){
        service.enviar(dados);
        return ResponseEntity.ok("Email enviado!");
    }
}
