package org.example.webdevtask.service.implementor;

import org.example.webdevtask.entity.User;
import org.example.webdevtask.pojo.UserPojo;
import org.example.webdevtask.repo.UserRepo;
import org.example.webdevtask.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class UserImpl implements UserService {
    private final UserRepo userRepo;
    @Override
    public void saveData(UserPojo userPojo) {
        User user = new User();
        user.setUserId(userPojo.getUserId());
        user.setUserName(userPojo.getUserName());
        userRepo.save(user);
    }
    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }
    @Override
    public void deleteById(Integer id) {
        userRepo.deleteById(Long.valueOf(id));
    }
    @Override
    public Optional<User> findById(Integer bookingId) {
        return userRepo.findById(Long.valueOf(bookingId));
    }
}