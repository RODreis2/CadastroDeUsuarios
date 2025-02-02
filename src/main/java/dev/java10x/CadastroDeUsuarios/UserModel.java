package dev.java10x.CadastroDeUsuarios;


import jakarta.persistence.*;

//transforma a classe em uma entidade do DB
@Entity
@Table(name = "tb_usuario")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private int idade;

    public UserModel() {
    }

    public UserModel(String name, String email, int idade) {
        this.name = name;
        this.email = email;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
