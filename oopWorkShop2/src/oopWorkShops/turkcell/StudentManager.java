package oopWorkShops.turkcell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentManager extends UserManager{


    @Override
    public void signIn(User user) {
        super.signIn(new Student());
    }

    @Override
    public void logIn(User user) {
        super.logIn(new Student());
    }

    @Override
    public void update(User user) {
        super.update(new Student());
    }

    @Override
    public void delete(User user) {
        super.delete(new Student());
    }


}
