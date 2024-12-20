package hust.soict.itep.lab01;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        // Mảng chứa các tháng đầy đủ và viết tắt
        String[] fullMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] shortMonths = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        String[] threeLetterMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        // Nhập năm cho đến khi hợp lệ
        while (true) {
            System.out.print("Nhap nam: ");
            String yearInput = scanner.nextLine().trim(); // Đọc vào dạng chuỗi

            if (!yearInput.matches("\\d+")) { // Kiểm tra xem đầu vào có phải là số không
                System.out.println("Nam khong hop le. Vui long nhap lai.");
                continue; // Lặp lại nếu đầu vào không hợp lệ
            }

            year = Integer.parseInt(yearInput); // Chuyển đổi sang số nguyên

            if (year < 0) {
                System.out.println("Nam khong hop le. Vui long nhap lai.");
                continue; // Lặp lại nếu năm âm
            }

            break; // Thoát khỏi vòng lặp nếu năm hợp lệ
        }

        // Nhập tháng
        while (true) {
            System.out.print("Nhap thang (ten thang, viet tat, hoac so): ");
            monthInput = scanner.nextLine().trim();

            int month = -1;

            // Xử lý đầu vào tháng dưới dạng số
            if (monthInput.matches("\\d+")) {
                month = Integer.parseInt(monthInput);
                if (month < 1 || month > 12) {
                    System.out.println("So thang khong hop le. Vui long nhap lai.");
                    continue; // Lặp lại từ đầu
                }
            } else {
                // Xử lý đầu vào tháng dưới dạng tên hoặc viết tắt
                for (int i = 0; i < 12; i++) {
                    if (monthInput.equalsIgnoreCase(fullMonths[i]) || monthInput.equalsIgnoreCase(shortMonths[i]) || monthInput.equalsIgnoreCase(threeLetterMonths[i])) {
                        month = i + 1;  // Lưu chỉ số tháng
                        break;
                    }
                }

                if (month == -1) {
                    System.out.println("Thang khong hop le. Vui long nhap lai.");
                    continue; // Lặp lại từ đầu
                }
            }

            // Kiểm tra năm nhuận
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            // Xác định số ngày của tháng
            int days = 0;
            switch (month) {
                case 2:
                    days = isLeapYear ? 29 : 28;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
                    break;
            }

            // Hiển thị kết quả
            System.out.println("Thang " + month + ", Nam " + year + " co " + days + " ngay.");
            break;  // Thoát khỏi vòng lặp sau khi nhập đúng
        }

        scanner.close();
    }
}
