package africa.semicolon.devops2.services;

import africa.semicolon.devops2.dto.requests.RegisterRequest;
import africa.semicolon.devops2.dto.responses.RegisterResponse;

public interface UserService {
    RegisterResponse register(RegisterRequest request);
}
