package in.dv.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.dv.main.entities.user;

@Repository
public interface userRepository extends JpaRepository< user, Long>{

} 
