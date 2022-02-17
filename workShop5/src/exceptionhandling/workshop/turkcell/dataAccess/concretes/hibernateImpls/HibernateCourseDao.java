package exceptionhandling.workshop.turkcell.dataAccess.concretes.hibernateImpls;

import exceptionhandling.workshop.turkcell.dataAccess.abstracts.CourseDao;
import exceptionhandling.workshop.turkcell.entities.concretes.Course;

public class HibernateCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println(course.getTitle() +" Hibernate ile veritabanina eklendi...");
    }

    @Override
    public void update(Course course) {
        System.out.println(course.getTitle() +" Hibernate ile veritabaninda guncellendi...");
    }

    @Override
    public void delete(Course course) {
        System.out.println(course.getTitle() +" Hibernate ile veritabanindan silindi...");
    }
}
