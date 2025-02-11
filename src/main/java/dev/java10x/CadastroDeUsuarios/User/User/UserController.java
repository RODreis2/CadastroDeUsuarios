package dev.java10x.CadastroDeUsuarios.User.User;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/boasVindas")
    public String BoasVindas(){
        return "Boas vindas";
    }


    //Adicionar usuario (CREATE)
    @PostMapping("/PublicarUser")
    public String CriarUsers(){
        return "Usuario criado";
    }

    //Mostrar todos os usuarios (READ)
    @GetMapping("/todos")
    public String MostrarUsers(){
        return "usuarios";
    }

    @PutMapping("/AlterarID")
    public String AlterarPorID(){
        return "Dados do usuario alterado";
    }

    @DeleteMapping("/DeletarUsuarioID")
    public String DeletarUsuario(){
        return "Usuario deletado";
    }
}
