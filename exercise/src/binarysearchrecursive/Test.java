package binarysearchrecursive;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 5, 8, 9, 12, 20, 24, 99};
        System.out.println("Enter a number: ");
        int input = Integer.parseInt(sc.nextLine());
        int index = binarySearch(arr, 0, (arr.length - 1), input);
        if (index == -1) {
            System.out.println("Khong co phan tu nay");
        } else {
            System.out.println("Vi tri can tim la: " + index);
        }
    }

    public static int binarySearch(int[] arr, int dau, int cuoi, int input) {
        int mid = (dau + cuoi) / 2;
        if (dau > cuoi) {
            return -1;
        } else if (input > arr[mid]) {
            return binarySearch(arr, mid + 1, cuoi, input);
        } else if (input == arr[mid]) {
            return mid;
        } else {
            return binarySearch(arr, dau, mid - 1, input);
        }

    }
}
