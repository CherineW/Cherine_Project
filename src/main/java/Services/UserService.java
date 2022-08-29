package Services;

import org.springframework.security.core.userdetails.UserDetailsService;

import Model.User;
import Web.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registerDto);
    
}
