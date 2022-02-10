package nlayeredapp.workshop.turkcell.dataAccess.abstracts;

import nlayeredapp.workshop.turkcell.entities.concretes.User;

public interface UserDao {

    void add(User user);
    void logIn(User user);
    void update(User user);
}
