package africa.semicolon.devops2.data.repository;

import africa.semicolon.devops2.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
