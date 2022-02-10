package nlayeredapp.workshop.turkcell.business.abstracts;

import nlayeredapp.workshop.turkcell.entities.concretes.Course;
import nlayeredapp.workshop.turkcell.entities.concretes.Student;

public interface CourseService {

    void getCoursesList(Course[] courses);
    void addStudent(Student student, Course courses);
}
