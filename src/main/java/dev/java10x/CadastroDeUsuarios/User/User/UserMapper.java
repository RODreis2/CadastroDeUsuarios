package dev.java10x.CadastroDeUsuarios.User.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserModel map(UserDTO userDTO){
        UserModel userModel = new UserModel();
        userModel.setId(userDTO.getId());
        userModel.setName(userDTO.getName());
        userModel.setAge(userDTO.getAge());
        userModel.setEmail(userDTO.getEmail());
        userModel.setCargo(userDTO.getCargo());
        return userModel;
    }
    public UserDTO map(UserModel userModel) {
        UserDTO userDTO = new UserDTO();
        userModel.setId(userModel.getId());
        userModel.setName(userModel.getName());
        userModel.setAge(userModel.getAge());
        userModel.setEmail(userModel.getEmail());
        userModel.setCargo(userModel.getCargo());
        return userDTO;

    }
}
