package dev.java10x.CadastroDeUsuarios.User.User;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    //List all users
    public List<UserModel> listUsers() {
        return userRepository.findAll();
    }

    //List users by id
    public UserModel listbyID(long id){
        Optional<UserModel> UserbyID = userRepository.findById(id);
        return UserbyID.orElse(null);
    }

    //Create users
    public  UserModel CreateUser(UserModel user){
        return userRepository.save(user);
    }

    //Delete user by id
    public void DeleteUser(long id){
        userRepository.deleteById(id);
    }


}
