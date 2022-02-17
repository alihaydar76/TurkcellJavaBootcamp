package exceptionhandling.workshop.turkcell.business.abstracts;

import exceptionhandling.workshop.turkcell.entities.concretes.Course;
import exceptionhandling.workshop.turkcell.entities.concretes.User;

public interface UserService {

    void addCourse(Course course, int miktar);
    void logIn(User user);
    void update(User user);
}
