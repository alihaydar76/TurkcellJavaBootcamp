package nlayeredapp.workshop.turkcell.dataAccess.concretes.jdbcImpls;

import nlayeredapp.workshop.turkcell.dataAccess.abstracts.CourseDao;
import nlayeredapp.workshop.turkcell.entities.concretes.Course;

public class JdbcCourseDao  implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println(course.getTitle() +" JDBC ile veritabanina eklendi...");
    }

    @Override
    public void update(Course course) {
        System.out.println(course.getTitle() +" JDBC ile veritabaninda guncellendi...");
    }

    @Override
    public void delete(Course course) {
        System.out.println(course.getTitle() +" JDBC ile veritabanindan silindi...");
    }

}
