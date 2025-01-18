package com.aulao10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class Controller {

    @GetMapping("/BoasVindas")
    public String boasVindas(){
        return "Essa é minha primeira menssagem nessa rota";
    }
}
