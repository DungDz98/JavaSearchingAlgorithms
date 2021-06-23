package test.electricmoney;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLyKhachHang {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<KhachHang> list = new ArrayList<>();

    public static void addKH(int choice1) {
        KhachHang khachHang;
        if (choice1 == 1) {
            khachHang = createKhachVN();
        } else {
            khachHang = createKhachNN();
        }
        list.add(khachHang);
    }

    private static KhachHangVietNam createKhachVN() {
        System.out.println("Nhap id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ho ten:");
        String name = sc.nextLine();
        System.out.println("Nhap ngay ra hoa don:");
        String dayHD = sc.nextLine();
        System.out.println("Nhap so luong: ");
        float soKW = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap don gia: ");
        float donGia = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap dinh muc: ");
        float dinhMuc = Float.parseFloat(sc.nextLine());

        KhachHangVietNam khachHangVietNam = new KhachHangVietNam(id, name, dayHD, soKW, donGia, dinhMuc);
        return khachHangVietNam;
    }

    private static KhachHangNuocNgoai createKhachNN() {
        System.out.println("Nhap id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ho ten:");
        String name = sc.nextLine();
        System.out.println("Nhap ngay ra hoa don:");
        String dayHD = sc.nextLine();
        System.out.println("Nhap so luong: ");
        float soKW = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap don gia: ");
        float donGia = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap quoc tich: ");
        String quocTich = sc.nextLine();

        KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai(id, name, dayHD, soKW, donGia, quocTich);
        return khachHangNuocNgoai;
    }

    public static void editKH(int choice2) {
        KhachHang khachHang;
        System.out.println("Nhap id khach hang: ");
        int index = Integer.parseInt(sc.nextLine());
        int index1 = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == index) {
                index1 = i;
                break;
            }
        }
        if (choice2 == 1) {
            khachHang = createKhachVN();
        } else {
            khachHang = createKhachNN();
        }
        if (index1 == -1) {
            System.out.println("Not found!");
        } else {
            list.set(index1, khachHang);
        }
    }

    public static void deleteKH() {
        System.out.println("Nhap id khach hang muon xoa: ");
        int index = Integer.parseInt(sc.nextLine());
        int index1 = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == index) {
                index1 = i;
                break;
            }
        }
        if (index1 == -1) {
            System.out.println("Not found");
        } else {

            list.remove(index1);
        }
    }

    public static void showKH() {
        for (KhachHang kh : list) {
            System.out.println(kh);
        }
    }

    public static void findKHByName() {
        System.out.println("Nhap ten can tim: ");
        String name = sc.nextLine();
        for (KhachHang kh : list) {
            if (kh.getName().equals(name)) {
                System.out.println(kh);
            }
        }
    }

    public static int binarySearch(int id) {

        int low = 0;
        int high = list.size() - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (id < list.get(mid).getId())
                high = mid - 1;
            else if (id == list.get(mid).getId())
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void findKHById() {
        System.out.println("Nhap id can tim");
        int id = Integer.parseInt(sc.nextLine());
        int index = binarySearch(id);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(list.get(index));
        }
    }


    public static void sapXep() {
        SapXepKhachHang sapXepKhachHang = new SapXepKhachHang();
        Collections.sort(list, sapXepKhachHang);
    }

}
