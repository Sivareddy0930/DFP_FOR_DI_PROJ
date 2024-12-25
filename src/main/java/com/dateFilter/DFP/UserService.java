package com.dateFilter.DFP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> saveAllUsers(List<User> users) {
        return userRepository.saveAll(users);
    }


    public List<User> getUserDataBetweenDates(LocalDateTime startDate, LocalDateTime endDate) {
        return userRepository.findByCreatedDateBetween(startDate, endDate);
    }
}
