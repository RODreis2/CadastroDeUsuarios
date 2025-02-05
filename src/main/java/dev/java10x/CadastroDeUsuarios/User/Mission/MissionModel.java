package dev.java10x.CadastroDeUsuarios.User.Mission;

import dev.java10x.CadastroDeUsuarios.User.User.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_missoes")
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nome")
    private String name;
    @Column(name = "descrição")
    private String description;

    //Uma missão pode ter varias pessoas
    @OneToMany(mappedBy = "mission")
    private List<UserModel> missions;


}
