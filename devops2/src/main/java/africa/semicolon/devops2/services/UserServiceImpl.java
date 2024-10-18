package africa.semicolon.devops2.services;

import africa.semicolon.devops2.data.model.User;
import africa.semicolon.devops2.data.repository.UserRepository;
import africa.semicolon.devops2.dto.requests.RegisterRequest;
import africa.semicolon.devops2.dto.responses.RegisterResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    private ModelMapper modelMapper;


    @Override
    public RegisterResponse register(RegisterRequest request) {
        User user = modelMapper.map(request, User.class);
        userRepository.save(user);
        RegisterResponse response = new RegisterResponse();
        response.setMessage("Successfully registered");
        return response;
    }
}
