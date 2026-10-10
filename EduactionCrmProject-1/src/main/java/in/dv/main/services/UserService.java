package in.dv.main.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.dv.main.entities.User;
import in.dv.main.repo.UserRepository;

@Service
public class UserService {
	
@Autowired	
 private UserRepository r;

public boolean registerUserService(User user) {
	try {
		r.save(user);
		return true;
	} catch (Exception e) {
		return false;
	}
}



public boolean loginUserService(String email, String password) {

Optional<User> op = r.findByEmail(email);

if (op.isPresent()) {

    User user = op.get();

    if (user.getPassword().equals(password)) {
        return true;
    }
}

return false;

}
	

}
