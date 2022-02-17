package exceptionhandling.workshop.turkcell.business.concretes;

import exceptionhandling.workshop.turkcell.business.abstracts.UserService;
import exceptionhandling.workshop.turkcell.core.exceptions.unchecked.IllegalEmailException;
import exceptionhandling.workshop.turkcell.core.exceptions.unchecked.IllegalNameException;
import exceptionhandling.workshop.turkcell.core.exceptions.unchecked.IllegalPasswordException;
import exceptionhandling.workshop.turkcell.core.loggers.abstracts.Logger;
import exceptionhandling.workshop.turkcell.dataAccess.abstracts.CourseDao;
import exceptionhandling.workshop.turkcell.dataAccess.abstracts.UserDao;
import exceptionhandling.workshop.turkcell.entities.concretes.Course;
import exceptionhandling.workshop.turkcell.entities.concretes.User;

public class UserManager implements UserService {

    private UserDao[] userDao;
    private CourseDao[] courseDao;
    private Logger[] logger;

    //Regular expressionlar ornekleme amacli yazilmistir. Matcher ve Pattern nesneleri uretilerek daha sonra update edilecektir.
    final String userNameRegex = "(\\w){8,12}";
    final String passwdRegex = "(\\w){8,12}";
    final String emailRegex = "@";

    public UserManager()
    {

    }
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

        if (isUserNameLegal(user) && isPasswordLegal(user))
        {
            if (user.getName().equals("dB_userName")) {
                if (user.getPassword().equals("dB_password")) {
                    for (UserDao userDaos : userDao) {
                        userDaos.logIn(user);
                    }
                }
                else if(!user.getPassword().equals("dB_password"))
                {
                    System.out.println("Sifreniz yanlis.");
                }
            }
            else if(!user.getName().equals("dB_userName"))
            {
                if (user.getPassword().equals("dB_password"))
                {
                    System.out.println("Boyle bir kullanici adi bulunamadi.");
                }
            }

        }

        else if (isUserNameLegal(user) && !isPasswordLegal(user))
        {
            throw new IllegalPasswordException("Lutfen sifrenizi belirtilen formatta giriniz.");
        }
        else if (!isUserNameLegal(user) && isPasswordLegal(user))
        {
            throw new IllegalNameException("Lutfen kullanici adinizi belirtilen formatta giriniz.");
        }

        for (Logger loggers : logger) {
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


    public boolean isUserNameLegal(User user) throws IllegalNameException
    {
        return user.getName().contains(userNameRegex);
    }

    public boolean isPasswordLegal(User user) throws IllegalPasswordException
    {
        return user.getPassword().contains(passwdRegex);
    }

    public boolean isEmailLegal(User user) throws IllegalEmailException
    {
        return user.getEmail().contains(emailRegex);
    }
}


