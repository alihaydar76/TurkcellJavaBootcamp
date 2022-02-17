package exceptionhandling.workshop.turkcell.dataAccess.abstracts;


import exceptionhandling.workshop.turkcell.entities.concretes.Course;

public interface CourseDao {

    void add(Course course);
    void update(Course course);
    void delete(Course course);

}
