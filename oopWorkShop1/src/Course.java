public class Course
{
    private int id;
    private String name;
    private String content;
    private String image;
    private double price;
    //tamamlanma orani kisiye ozel ama ekranda oldugu icin constructor'da ekrandaki degerleri ekledik.
    private int percentOfComplete;
    private Instructor [] instructors;
    private Category category;

    public Course() {
        super();
    }

    public Course(int id, String name, String content, String image, double price, int percentOfComplete,
                Instructor[] instructors, Category category) {
        super();
        this.id = id;
        this.name = name;
        this.content = content;
        this.image = image;
        this.price = price;
        this.percentOfComplete = percentOfComplete;
        this.instructors = instructors;
        this.category = category;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getPercentOfComplete() {
        return percentOfComplete;
    }
    public void setPercentOfComplete(int percentOfComplete) {
        this.percentOfComplete = percentOfComplete;
    }
    public Instructor[] getInstructors() {
        return instructors;
    }
    public void setInstructor(Instructor[] instructors) {
        this.instructors = instructors;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
