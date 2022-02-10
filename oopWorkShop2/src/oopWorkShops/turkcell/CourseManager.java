package oopWorkShops.turkcell;

public class CourseManager {

    public void cousesList(Course[] courses) {
        for (Course course : courses) {
            System.out.println("id: " + course.getId() + " Name: " + course.getTitle());
        }
    }

    public void addStudent(Student student, Course course) {
        System.out.println(student.getName() + " added This : " + course.getTitle() + " Course");
    }
}
