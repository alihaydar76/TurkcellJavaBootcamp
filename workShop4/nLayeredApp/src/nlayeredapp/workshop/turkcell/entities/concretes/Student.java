package nlayeredapp.workshop.turkcell.entities.concretes;

import nlayeredapp.workshop.turkcell.entities.abstracts.Entity;

public class Student extends User implements Entity
{
    private Course[] enrolledCourses;

    public Student()
    {

    }

    public Student(int id, String name, String email, String password, String image) {
        super(id, name, email, password, image);
    }

    public Course[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(Course... enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
