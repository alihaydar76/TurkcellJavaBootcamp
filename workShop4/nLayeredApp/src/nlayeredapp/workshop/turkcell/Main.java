package nlayeredapp.workshop.turkcell;

import nlayeredapp.workshop.turkcell.business.concretes.CourseManager;
import nlayeredapp.workshop.turkcell.business.concretes.UserManager;
import nlayeredapp.workshop.turkcell.core.abstracts.Logger;
import nlayeredapp.workshop.turkcell.core.concretes.DatabaseLogger;
import nlayeredapp.workshop.turkcell.core.concretes.EmailLogger;
import nlayeredapp.workshop.turkcell.dataAccess.abstracts.CourseDao;
import nlayeredapp.workshop.turkcell.dataAccess.abstracts.UserDao;
import nlayeredapp.workshop.turkcell.dataAccess.concretes.hibernateImpls.HibernateUserDao;
import nlayeredapp.workshop.turkcell.dataAccess.concretes.jdbcImpls.JdbcCourseDao;
import nlayeredapp.workshop.turkcell.dataAccess.concretes.jdbcImpls.JdbcUserDao;
import nlayeredapp.workshop.turkcell.entities.concretes.*;

public class Main {

    public static void main(String[] args) {


    }
}
