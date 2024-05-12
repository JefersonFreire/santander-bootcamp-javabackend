package bootcamp.santander2024.dio.domain.repository;

import bootcamp.santander2024.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
