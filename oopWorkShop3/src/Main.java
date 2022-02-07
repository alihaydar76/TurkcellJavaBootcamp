public class Main {

    public static void main(String[] args) {

        Kredi kredi1 = new Kredi(1,"Tarim Kredisi",5000.0,60000.0);


        KrediManager manager = new KrediManager(new HibernateDao(), new BaseLogger[]{new DatabaseLogger(), new SmsLogger()});

        manager.add(kredi1,4000);
        manager.create(kredi1,5000);
        manager.update(kredi1,6000);
        manager.delete(kredi1,65000);

    }
}
