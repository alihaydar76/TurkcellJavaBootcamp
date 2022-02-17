package exceptionhandling.workshop.turkcell.dataAccess.abstracts;

import exceptionhandling.workshop.turkcell.entities.concretes.User;

public interface UserDao {
    void add(User user);
    void logIn(User user);
    void update(User user);
}
