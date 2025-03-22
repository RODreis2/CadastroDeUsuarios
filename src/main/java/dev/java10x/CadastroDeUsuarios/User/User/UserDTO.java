package dev.java10x.CadastroDeUsuarios.User.User;

import dev.java10x.CadastroDeUsuarios.User.Mission.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private long id;
    private String name;
    private String email;
    private int age;
    private MissionModel mission;
    private String cargo;


}
