package test.electricmoney;

public class KhachHang {
    private int id;
    private String name;
    private String dayHD;
    private float soKW;
    private float donGia;

    public KhachHang() {
    }

    public KhachHang(int id, String name, String dayHD, float soKW, float donGia) {
        this.id = id;
        this.name = name;
        this.dayHD = dayHD;
        this.soKW = soKW;
        this.donGia = donGia;
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

    public String getDayHD() {
        return dayHD;
    }

    public void setDayHD(String dayHD) {
        this.dayHD = dayHD;
    }

    public float getSoKW() {
        return soKW;
    }

    public void setSoKW(float soKW) {
        this.soKW = soKW;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayHD='" + dayHD + '\'' +
                ", soKW=" + soKW +
                ", donGia=" + donGia +
                '}';
    }
}
