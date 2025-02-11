package dev.java10x.CadastroDeUsuarios.User.User;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/boasVindas")
    public String BoasVindas(){
        return "Boas vindas";
    }


    //Adicionar usuario (CREATE)
    @PostMapping("/adicionar")
    public String CriarUsers(){
        return "Usuario criado";
    }

    //Mostrar todos os usuarios (READ)
    @GetMapping("/listar")
    public List<UserModel> MostrarUsers(){
        return userService.listUsers();
    }

    @PutMapping("/AlterarID")
    public String AlterarPorID(){
        return "Dados do usuario alterado";
    }

    @DeleteMapping("/DeletarID")
    public String DeletarUsuario(){
        return "Usuario deletado";
    }
}
