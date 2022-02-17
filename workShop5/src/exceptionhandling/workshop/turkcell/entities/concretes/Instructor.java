package exceptionhandling.workshop.turkcell.entities.concretes;

public class Instructor extends User{

    private double star;
    private Course[] courses;

    public Instructor()
    {

    }

    public Instructor(int id, String name, String email, String password, String image, double star) {
        super(id, name, email, password, image);
        this.star = star;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
