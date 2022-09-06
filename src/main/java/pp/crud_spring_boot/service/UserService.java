package pp.crud_spring_boot.service;

import pp.crud_spring_boot.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {
    @Transactional
    List<User> findAll();

    @Transactional
    User findById(Long id);

    @Transactional
    void save(User user);

    @Transactional
    void update(Long id, User updatedUser);

    @Transactional
    void delete(Long id);

}
