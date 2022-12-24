package com.github.nazaninhmz.danceHall.repository;

import com.github.nazaninhmz.danceHall.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public User updateUser(User user) {
        removeUser(user);
        users.add(user);
        return user;
    }

    private void removeUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == user.getId()){
                users.remove(i);
            }
        }
    }

    public List<User> getAll() {
        return users;
    }

    public boolean userExistWithUserName(String username){
        return false;
        // TODO:
    }

    public void saveUser(User user) {
        users.add(user);
    }

    public User getUserById(int id) {
        // TODO: Optional
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public Optional<User> getUserByUserName(String username) {
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

}
