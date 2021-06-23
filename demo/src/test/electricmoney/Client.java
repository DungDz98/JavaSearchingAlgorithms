package test.electricmoney;

import java.util.Scanner;

public class Client {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Quan Ly Khach Hang");
            System.out.println("1. Them Khach Hang");
            System.out.println("2. Sua Khach Hang");
            System.out.println("3. Xoa Khach Hang");
            System.out.println("4. Tim Khach Hang Theo Name");
            System.out.println("5. Tim Khach Hang Theo Id");
            System.out.println("6. Sap xep Khach Hang theo ID");
            System.out.println("7. Hien thi Khach Hang");
            System.out.println("8. Exit");
            System.out.println("Moi ban chon lua: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Khach Hang Viet Nam");
                    System.out.println("2. Khach Hang Nuoc Ngoai");
                    System.out.println("Chon di ban");
                    int choice1 = Integer.parseInt(sc.nextLine());
                    QuanLyKhachHang.addKH(choice1);
                    break;
                case 2:
                    System.out.println("1. Khach Hang Viet Nam");
                    System.out.println("2. Khach Hang Nuoc Ngoai");
                    System.out.println("Chon di ban");
                    int choice2 = Integer.parseInt(sc.nextLine());
                    QuanLyKhachHang.editKH(choice2);
                    break;
                case 3:
                    QuanLyKhachHang.deleteKH();
                    break;
                case 4:
                    QuanLyKhachHang.findKHByName();
                    break;
                case 5:
                    QuanLyKhachHang.findKHById();
                    break;
                case 6:
                    QuanLyKhachHang.sapXep();
                    break;
                case 7:
                    QuanLyKhachHang.showKH();
                    break;
                case 8:
                    System.exit(0);

            }
        }
    }
}
