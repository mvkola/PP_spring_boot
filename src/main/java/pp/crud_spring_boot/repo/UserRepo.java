package pp.crud_spring_boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pp.crud_spring_boot.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
