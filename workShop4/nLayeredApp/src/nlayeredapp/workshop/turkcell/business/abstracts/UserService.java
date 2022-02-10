package nlayeredapp.workshop.turkcell.business.abstracts;

import nlayeredapp.workshop.turkcell.entities.concretes.Course;
import nlayeredapp.workshop.turkcell.entities.concretes.User;

public interface UserService {

    void addCourse(Course course, int miktar);
    void logIn(User user);
    void update(User user);
}
