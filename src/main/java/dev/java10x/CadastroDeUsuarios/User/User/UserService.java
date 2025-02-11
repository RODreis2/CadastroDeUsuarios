package dev.java10x.CadastroDeUsuarios.User.User;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;


    public List<UserModel> listUsers() {
        return userRepository.findAll();
    }

    public UserModel listbyID(long id){
        Optional<UserModel> UserbyID = userRepository.findById(id);
        return UserbyID.orElse(null);
    }
}
