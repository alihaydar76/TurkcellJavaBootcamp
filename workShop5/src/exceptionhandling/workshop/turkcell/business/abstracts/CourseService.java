package exceptionhandling.workshop.turkcell.business.abstracts;

import exceptionhandling.workshop.turkcell.entities.concretes.Course;
import exceptionhandling.workshop.turkcell.entities.concretes.Student;

public interface CourseService {

    void getCoursesList(Course[] courses);
    void addStudent(Student student, Course courses);
}
