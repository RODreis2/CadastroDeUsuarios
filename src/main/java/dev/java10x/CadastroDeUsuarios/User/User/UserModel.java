package dev.java10x.CadastroDeUsuarios.User.User;


import dev.java10x.CadastroDeUsuarios.User.Mission.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//transforma a classe em uma entidade do DB
@Entity
@Table(name = "tb_usuario")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int age;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissionModel mission;

}
