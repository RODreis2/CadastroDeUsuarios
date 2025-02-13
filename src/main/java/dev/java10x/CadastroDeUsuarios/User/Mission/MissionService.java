package dev.java10x.CadastroDeUsuarios.User.Mission;


import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MissionService {
    private MissionsRepository missionsRepository;

    public List<MissionModel> ListMission(){
        return missionsRepository.findAll();
    }
    public MissionModel MissionByID(long id){
        Optional<MissionModel> MissionByID = missionsRepository.findById(id);
        return MissionByID.orElse(null);
    }

    public MissionModel CreateUser(MissionModel mission){
        return missionsRepository.save(mission);
    }

    public void DeleteMission(long id){
        missionsRepository.deleteById(id);
    }
}
