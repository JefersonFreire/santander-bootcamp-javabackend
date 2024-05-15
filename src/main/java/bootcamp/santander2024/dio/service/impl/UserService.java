package bootcamp.santander2024.dio.service.impl;

import bootcamp.santander2024.dio.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
