package test.electricmoney;

import java.util.Comparator;

public class SapXepKhachHang implements Comparator<KhachHang> {

    @Override
    public int compare(KhachHang o1, KhachHang o2) {
        if (o1.getId() > o2.getId()) return 1;
        else return -1;
    }
}
