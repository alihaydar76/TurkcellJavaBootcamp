public class SmsLogger implements BaseLogger
{
    @Override
    public void log(String message) {
        System.out.println("SmsLogger calisti: "+message);
    }
}
