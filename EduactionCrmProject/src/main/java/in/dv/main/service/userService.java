package in.dv.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.dv.main.entities.user;
import in.dv.main.repo.userRepository;

@Service
public class userService {
	@Autowired
	private userRepository r;
	
	
	public boolean registrationUserService(user u) {
		try {
			r.save(u);
			return true;
		}catch (Exception e) {
			 return false;
		}
	}
	
	

}
