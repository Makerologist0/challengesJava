public class Ilan {
    private String marka;
    private String model;
    private int gun;
    private double fiyat;
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getGun() {
        return gun;
    }
    public void setGun(int gun) {
        this.gun = gun;
    }
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    public Ilan() {
    }
    public Ilan(String marka, String model, int gun, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.gun = gun;
        this.fiyat = fiyat;
    }
    @Override
    public String toString() {
        return "Ilan [marka=" + marka + ", model=" + model + ", gun=" + gun + ", fiyat=" + fiyat + "]";
    }
}
