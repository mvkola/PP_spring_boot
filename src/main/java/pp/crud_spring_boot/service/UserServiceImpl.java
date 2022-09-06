package pp.crud_spring_boot.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pp.crud_spring_boot.exception.NotFoundException;
import pp.crud_spring_boot.model.User;
import pp.crud_spring_boot.repo.UserRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).orElseThrow(() ->
                new NotFoundException("User not found"));
    }

    @Transactional
    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Transactional
    @Override
    public void update(Long id, User updatedUser) {
        User user = findById(id);
        user.setName(updatedUser.getName());
        user.setAge(updatedUser.getAge());
        userRepo.save(user);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userRepo.delete(findById(id));
    }

}
