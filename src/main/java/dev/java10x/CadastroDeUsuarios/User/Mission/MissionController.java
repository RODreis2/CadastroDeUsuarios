package dev.java10x.CadastroDeUsuarios.User.Mission;

import dev.java10x.CadastroDeUsuarios.User.User.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Mission")
public class MissionController {

    private MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @PostMapping("/adicionar")
    public MissionModel CreateMission(MissionModel missionModel){
        return missionService.CreateUser(missionModel);
    }

    @GetMapping("/Listar")
    public List<MissionModel> ListMission(){
        return missionService.ListMission();
    }

    @GetMapping("/Listar")
    public MissionModel ListMissionID(@PathVariable long id){
        return missionService.MissionByID(id);
    }

    @DeleteMapping("/Delete/{id}")
    public void DeletarMission(long id){
        missionService.DeleteMission(id);
    }

    @PutMapping("/Alterar/{id}")
    public String AlterMission(){
        return "Missao alterada";
    }
}
