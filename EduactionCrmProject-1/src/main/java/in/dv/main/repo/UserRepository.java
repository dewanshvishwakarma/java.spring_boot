package in.dv.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.dv.main.entities.User;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository< User, Long> {

		Optional<User> findByEmail(String email);
}
