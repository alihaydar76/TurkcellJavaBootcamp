package nlayeredapp.workshop.turkcell.dataAccess.concretes.hibernateImpls;

import nlayeredapp.workshop.turkcell.dataAccess.abstracts.UserDao;
import nlayeredapp.workshop.turkcell.entities.concretes.User;

public class HibernateUserDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println(user.getName() + " kullanicisi Hibernate ile eklendi...\n");
    }

    @Override
    public void update(User user) {
        System.out.println("Sayin "+user.getName() + ", profiliniz Hibernate ile guncellendi...\n");
    }

    @Override
    public void logIn(User user) {
        System.out.println("Sayin "+user.getName() + ", sifreniz Hibernate ile dogrulandi. Hosgeldin.\n");
    }
}
