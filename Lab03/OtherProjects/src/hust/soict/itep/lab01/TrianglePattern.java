package hust.soict.itep.lab01;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập chiều cao của tam giác
        System.out.print("Trung-Nhap chieu cao tam giac: ");
        int n = scanner.nextInt();
        // Vẽ tam giác
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng trước các dấu sao để căn giữa
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // In dấu sao
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Xuống dòng sau khi in xong một dòng sao
            System.out.println();
        }
        // Đóng scanner để giải phóng tài nguyên
        scanner.close();
    }
}
