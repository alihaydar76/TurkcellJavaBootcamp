package nlayeredapp.workshop.turkcell.business.concretes;

import nlayeredapp.workshop.turkcell.business.abstracts.UserService;
import nlayeredapp.workshop.turkcell.core.abstracts.Logger;
import nlayeredapp.workshop.turkcell.dataAccess.abstracts.CourseDao;
import nlayeredapp.workshop.turkcell.dataAccess.abstracts.UserDao;
import nlayeredapp.workshop.turkcell.entities.concretes.Course;
import nlayeredapp.workshop.turkcell.entities.concretes.User;

public class UserManager implements UserService {

    private UserDao[] userDao;
    private CourseDao[] courseDao;
    private Logger[] logger;

    /*public UserManager()
    {

    }*/
    public UserManager(UserDao[] userDao, CourseDao[] courseDao, Logger[] logger)
    {
        this.userDao = userDao;
        this.courseDao = courseDao;
        this.logger = logger;

    }

    @Override
    public void addCourse(Course course, int miktar) {

        if(miktar>=course.getPrice())
        {
            miktar-=course.getPrice();
            for(CourseDao courseDaos : courseDao )
            {
                courseDaos.add(course);
            }
        }
        else
            System.out.println("Odeme yapilamadi.");

        for(Logger loggers: logger)
        {
            loggers.log("Hareketler basariyla kaydedildi...");
        }
    }

    @Override
    public void logIn(User user) {
        if(user.getName().equals("dB_userName")) {
            if (user.getPassword().equals("dB_password")) {
                for(UserDao userDaos: userDao)
                {
                    userDaos.logIn(user);
                }
            } else if (!user.getPassword().equals("dB_password")) {
                System.out.println("Sifreniz yanlis...");
            }
        }
        else if (!user.getName().equals("Ali")) {
            System.out.println("Kullanici adiniz yanlis...");
        }


        for(Logger loggers: logger)
        {
                loggers.log("Hareketler basariyla kaydedildi...");
        }



    }

    @Override
    public void update(User user) {
        System.out.println("Guncellendi : " + user.getName());

        for(UserDao userDaos: userDao)
        {
            userDaos.update(user);
        }
        for(Logger loggers: logger)
        {
            loggers.log("Hareketler basariyla kaydedildi...");
        }

    }
}
