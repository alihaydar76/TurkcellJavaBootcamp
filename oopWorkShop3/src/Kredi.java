public class Kredi {

    private int id;
    private String name;
    private double minKredi;
    private double maxKredi;

    public Kredi()
    {

    }

    public Kredi(int id, String name, double minKredi, double maxKredi) {
        this.id = id;
        this.name = name;
        this.minKredi = minKredi;
        this.maxKredi = maxKredi;
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

    public double getMinKredi() {
        return minKredi;
    }

    public void setMinKredi(double minKredi) {
        this.minKredi = minKredi;
    }

    public double getMaxKredi() {
        return maxKredi;
    }

    public void setMaxKredi(double maxKredi) {
        this.maxKredi = maxKredi;
    }
}


