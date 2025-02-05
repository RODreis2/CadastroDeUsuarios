package dev.java10x.CadastroDeUsuarios.User.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/boasVindas")
    public String BoasVindas(){
        return "Boas vindas";
    }
}
