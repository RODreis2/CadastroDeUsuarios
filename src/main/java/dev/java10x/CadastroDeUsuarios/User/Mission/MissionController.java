package dev.java10x.CadastroDeUsuarios.User.Mission;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Missoes")
public class MissionController {

    @PostMapping("/PublicarMissao")
    public String CriarUsers(){
        return "Usuario criado";
    }

    @GetMapping("/Listar")
    public String ListMission(){
        return "Missoes";
    }

    @PutMapping("/Alterar")
    public String AlterMission(){
        return "Missao alterada";
    }

    @DeleteMapping("/Delete")
    public String DeletarMission(){
        return "Missao deletada";
    }
}
