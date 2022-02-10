package nlayeredapp.workshop.turkcell.business.concretes;

import nlayeredapp.workshop.turkcell.business.abstracts.CourseService;
import nlayeredapp.workshop.turkcell.core.abstracts.Logger;
import nlayeredapp.workshop.turkcell.dataAccess.abstracts.CourseDao;
import nlayeredapp.workshop.turkcell.dataAccess.abstracts.UserDao;
import nlayeredapp.workshop.turkcell.entities.concretes.Course;
import nlayeredapp.workshop.turkcell.entities.concretes.Student;

public class CourseManager implements CourseService {

    private UserDao[] userDao;
    private CourseDao[] courseDao;
    private Logger[] logger;

    public CourseManager()
    {

    }
    public CourseManager(UserDao[] userDao, CourseDao[] courseDao, Logger[] logger)
    {
        this.userDao = userDao;
        this.courseDao = courseDao;
        this.logger = logger;
    }


    @Override
    public void getCoursesList(Course[] courses) {
        for (Course course : courses) {
            System.out.println("Course ID: " + course.getId() + ", Name: " + course.getTitle());
        }

    }

    @Override
    public void addStudent(Student student, Course courses) {
        System.out.println("Kullanici "+ student.getName() + " icin eklenen ders : " + courses.getTitle());

        for(CourseDao courseDaos: courseDao )
        {
            courseDaos.add(courses);
        }

        for(UserDao userDaos: userDao)
        {
            userDaos.add(student);
        }
        for(Logger loggers: logger)
        {
            loggers.log("Hareketler basariyla eklendi...");
        }
    }
}
