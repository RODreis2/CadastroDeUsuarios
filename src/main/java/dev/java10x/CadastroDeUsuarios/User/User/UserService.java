package dev.java10x.CadastroDeUsuarios.User.User;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    //List all users
    public List<UserDTO> listUsers() {
        List<UserModel> users = userRepository.findAll();

        return users.stream()
                .map(userMapper::map)
                .collect(Collectors.toList());
    }

    //List users by id
    public UserDTO listbyID(long id){
        Optional<UserModel> UserbyID = userRepository.findById(id);
        return UserbyID.map(userMapper::map).orElse(null);
    }

    //Create users
    public UserDTO CreateUser(UserDTO userDTO){
        UserModel user = userMapper.map(userDTO);
        user = userRepository.save(user);
        return userMapper.map(user);
    }

    //Update users
    public  UserDTO UpdateUser(long id, UserDTO userDTO){
        Optional<UserModel> userExist = userRepository.findById(id);
        if (userExist.isPresent()){
            UserModel updatedUser = userMapper.map(userDTO);
            updatedUser.setId(id);
            UserModel userSave = userRepository.save(updatedUser);
            return userMapper.map(userSave);
        }
        return null;
    }

    //Delete user by id
    public void DeleteUser(long id){
        userRepository.deleteById(id);
    }


}
