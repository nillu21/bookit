package ee.taltech.spring.bookit.service;

import ee.taltech.spring.bookit.domain.User;
import ee.taltech.spring.bookit.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    UserRepository repo;

    public User getUserById(long id) {

        return repo.getOne(id);
    }

    public List<User> getUsers() {
        return repo.findAll();
    }
}
