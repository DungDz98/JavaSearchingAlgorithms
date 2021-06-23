package test.electricmoney;

public class KhachHangVietNam extends KhachHang{
    private float dinhMuc;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public KhachHangVietNam(int id, String name, String dayHD, float soKW, float donGia, float dinhMuc) {
        super(id, name, dayHD, soKW, donGia);
        this.dinhMuc = dinhMuc;
    }

    public float getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public double getThanhTien() {
        double thanhTien;
        if (this.getSoKW() < this.getDinhMuc()) {
            thanhTien = this.getSoKW() * this.getDonGia();
        } else {
            thanhTien = this.getSoKW() * this.getDonGia() * this.getDinhMuc() + (this.getSoKW() - this.getDinhMuc()) * this.getDonGia() * 2.5;
        }
        return thanhTien;
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" +
                "dinhMuc=" + dinhMuc +
                '}' + super.toString();
    }
}
