public class KrediManager
{

    private KrediDao krediDao;
    private BaseLogger[] baseLogger;


    public KrediManager(KrediDao krediDao, BaseLogger[] baseLogger)
    {
        this.krediDao = krediDao;
        this.baseLogger=baseLogger;
    }


    public void create(Kredi kredi, int miktar)
    {
        this.krediDao.create(kredi);
        for(BaseLogger logger: baseLogger)
        {
            logger.log("islemler loglandi(kredi olsuturuldu)");
        }
    }

    public void add(Kredi kredi, int miktar)
    {
        if(miktar< kredi.getMinKredi())
        {
            System.out.println("Minimum tutardan az istekte bulundunuz.");
        }
        else if(miktar > kredi.getMaxKredi())
        {
            System.out.println("Maksimum tutardan fazla istekte bulundunuz.");
        }
        else
        {
            System.out.println("Basvurunuz onaylandi...");
            this.krediDao.add(kredi);
            for(BaseLogger logger: baseLogger)
            {
                logger.log("islemler loglandi(kredi eklendi)");
            }
        }

    }

    public void update(Kredi kredi, int miktar)
    {
        this.krediDao.update(kredi);
        for(BaseLogger logger: baseLogger)
        {
            logger.log("islemler loglandi(kredi guncellendi)");
        }
    }

    public void delete(Kredi kredi, int miktar)
    {
        this.krediDao.delete(kredi);
        for(BaseLogger logger: baseLogger)
        {
            logger.log("islemler loglandi(kredi silindi)");
        }
    }


}
