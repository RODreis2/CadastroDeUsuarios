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
    public UserDTO CriarUsers(UserDTO userDTO){
        return userService.CreateUser(userDTO);
    }

    //Mostrar todos os usuarios (READ)
    @GetMapping("/listar")
    public List<UserDTO> MostrarUsers(){
        return userService.listUsers();
    }

    //Mostrar todos os usuarios (READ)
    @GetMapping("/listar/{id}")
    public UserDTO MostrarUsersID(@PathVariable long id){
        return userService.listbyID(id) ;
    }

    @PutMapping("/Alterar/{id}")
    public UserDTO AlterarPorID(@PathVariable long id,@RequestBody UserDTO useratualizado){
        return userService.UpdateUser(id,useratualizado);
    }

    @DeleteMapping("/DeletarID")
    public void DeletarUsuario(@PathVariable long id){
         userService.DeleteUser(id);
    }
}
