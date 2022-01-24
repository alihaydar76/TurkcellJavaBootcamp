package oopWorkShops.turkcell;

public class InstructorManager extends UserManager{

    @Override
    public void signIn(User user) {
        super.signIn(new Instructor());
    }

    @Override
    public void logIn(User user) {
        super.logIn(new Instructor());
    }

    @Override
    public void update(User user) {
        super.update(new Instructor());
    }

    @Override
    public void delete(User user) {
        super.delete(new Instructor());
    }

    public void uploadVideo()
    {
        System.out.println("Video uploaded...");
    }
}
