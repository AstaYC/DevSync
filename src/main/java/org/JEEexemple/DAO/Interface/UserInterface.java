package org.JEEexemple.DAO.Interface;
import org.JEEexemple.Models.User;

import java.util.List;

public interface UserInterface {
    void createUser(User user);
    User displayUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> findAllUser();
}
