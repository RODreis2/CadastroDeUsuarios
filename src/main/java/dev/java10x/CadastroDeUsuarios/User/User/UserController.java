package dev.java10x.CadastroDeUsuarios.User.User;

import org.hibernate.query.UnknownSqlResultSetMappingException;
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
    public UserModel CriarUsers(UserModel userModel){
        return userService.CreateUser(userModel);
    }

    //Mostrar todos os usuarios (READ)
    @GetMapping("/listar")
    public List<UserModel> MostrarUsers(){
        return userService.listUsers();
    }

    //Mostrar todos os usuarios (READ)
    @GetMapping("/listar/{id}")
    public UserModel MostrarUsersID(@PathVariable long id){
        return userService.listbyID(id) ;
    }

    @PutMapping("/Alterar/{id}")
    public UserModel AlterarPorID(@PathVariable long id,@RequestBody UserModel useratualizado){
        return userService.UpdateUser(id,useratualizado);
    }

    @DeleteMapping("/DeletarID")
    public void DeletarUsuario(@PathVariable long id){
         userService.DeleteUser(id);
    }
}
