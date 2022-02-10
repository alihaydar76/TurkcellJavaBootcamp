package nlayeredapp.workshop.turkcell.dataAccess.abstracts;

import nlayeredapp.workshop.turkcell.entities.concretes.Course;

public interface CourseDao {

    void add(Course course);
    void update(Course course);
    void delete(Course course);

}
