public class MailLogger implements BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("MailLogger calisti: "+message);
    }
}
