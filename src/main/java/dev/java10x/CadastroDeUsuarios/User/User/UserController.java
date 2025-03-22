package dev.java10x.CadastroDeUsuarios.User.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> CriarUsers(UserDTO user){
        UserDTO newUser = userService.CreateUser(user);
        return ResponseEntity.status(HttpStatus.CREATED)
        .body("User criado com sucesso: " + newUser.getName() + "(ID): " + newUser.getId());
    }

    //Mostrar todos os usuarios (READ)
    @GetMapping("/listar")
    public ResponseEntity<List<UserDTO>> MostrarUsers(){
     List<UserDTO> users = userService.listUsers();
     return ResponseEntity.ok(users);
    }

    //Mostrar todos os usuarios (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> MostrarUsersID(@PathVariable long id){
        UserDTO user = userService.listbyID(id);
        if (user != null){
            return ResponseEntity.ok(user);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User não encontrado");
        }
    }

    @PutMapping("/Alterar/{id}")
    public ResponseEntity<String> AlterarPorID(@PathVariable long id,@RequestBody UserDTO useratualizado){
        if (userService.listbyID(id) != null){
            userService.UpdateUser(id, useratualizado);
            return ResponseEntity.ok("User atualizado com sucesso");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User não encontrado");
        }
    }

    @DeleteMapping("/DeletarID")
    public ResponseEntity<String> DeletarUsuario(@PathVariable long id){
        if (userService.listbyID(id) != null) {
            userService.DeleteUser(id);
            return ResponseEntity.ok("User deletado com sucesso");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User não encontrado");
        }
    }
}
