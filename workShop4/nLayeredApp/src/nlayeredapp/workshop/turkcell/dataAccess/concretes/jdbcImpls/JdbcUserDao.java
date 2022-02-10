package nlayeredapp.workshop.turkcell.dataAccess.concretes.jdbcImpls;

import nlayeredapp.workshop.turkcell.dataAccess.abstracts.UserDao;
import nlayeredapp.workshop.turkcell.entities.concretes.User;

public class JdbcUserDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println(user.getName() + " kullanicisi JDBC ile eklendi...\n");
    }

    @Override
    public void update(User user) {
        System.out.println("Sayin "+user.getName() + ", profiliniz JDBC ile guncellendi...\n");
    }

    @Override
    public void logIn(User user) {
        System.out.println("Sayin "+user.getName() + ", sifreniz JDBC ile dogrulandi.\nHosgeldiniz...\n");
    }
}
