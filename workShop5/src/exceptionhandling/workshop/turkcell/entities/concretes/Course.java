package exceptionhandling.workshop.turkcell.entities.concretes;

public class Course {


    private int id;
    private String title;
    private String content;
    private String image;
    private Double price;
    private Instructor[] instructors; //Bir dersin birden fazla egitmeni olabilir
    private Category category;
    private Student[] students; //Bir dersin birden fazla ogrencisi olabilir


    public Course(){

    }

    public Course(int id, String title, String content, String image, Double price)
    {
        this.id=id;
        this.title=title;
        this.content=content;
        this.image=image;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
