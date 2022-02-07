public class HibernateDao implements KrediDao{
    @Override
    public void create(Kredi kredi) {
        System.out.println(kredi.getName()+" Hibernate ile olusturuldu.");
    }

    @Override
    public void add(Kredi kredi) {
        System.out.println(kredi.getName()+" Hibernate ile eklendi.");
    }

    @Override
    public void update(Kredi kredi) {
        System.out.println(kredi.getName()+" Hibernate ile guncellendi.");
    }

    @Override
    public void delete(Kredi kredi) {
        System.out.println(kredi.getName()+" Hibernate ile silindi.");
    }
}
