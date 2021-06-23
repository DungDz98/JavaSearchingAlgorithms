package test.electricmoney;

public class KhachHangNuocNgoai extends KhachHang{
    private String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai(int id, String name, String dayHD, float soKW, float donGia, String quocTich) {
        super(id, name, dayHD, soKW, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public double getThanhTien() {
        return this.getSoKW() * this.getDonGia();
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" +
                "quocTich='" + quocTich + '\'' +
                '}' + super.toString();
    }
}
