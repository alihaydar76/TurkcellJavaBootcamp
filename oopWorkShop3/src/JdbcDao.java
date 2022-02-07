public class JdbcDao implements KrediDao{


    @Override
    public void create(Kredi kredi) {
        System.out.println(kredi.getName()+" JDBC ile olusturuldu.");
    }

    @Override
    public void add(Kredi kredi) {
        System.out.println(kredi.getName()+" JDBC ile eklendi.");
    }

    @Override
    public void update(Kredi kredi) {
        System.out.println(kredi.getName()+" JDBC ile guncellendi.");
    }

    @Override
    public void delete(Kredi kredi) {
        System.out.println(kredi.getName()+" JDBC ile silindi.");
    }
}
