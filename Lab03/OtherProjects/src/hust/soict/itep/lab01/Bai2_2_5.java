package hust.soict.itep.lab01;
import java.util.Scanner;
//Do Dinh Trung - Bai 2.2.5
public class Bai2_2_5 {
	public static void main(String[] args) {
		//Khoi tao doi tuong Scanner đe nhap du lieu tu ban phim
		Scanner scanner = new Scanner(System.in);
		//Nhap 2 so
		System.out.print("Trung-Nhap so thu nhat: ");
		String str_num1 = scanner.nextLine();
		System.out.print("Trung-Nhap so thu hai: ");
		String str_num2 = scanner.nextLine();
		//Chuyen đoi tu string sang double
		double num1 = Double.parseDouble(str_num1);
		double num2 = Double.parseDouble(str_num2);
		//Tinh tong, chenh lech, tich
		System.out.println("Trung-Tong: " + (num1 + num2));
		System.out.println("Trung-Chenh lech: " + Math.abs(num1 - num2));
		System.out.println("Trung-Tich: " + num1 * num2);
		//Kiem tra uoc so truoc khi thuc hien phep chia
		if(num2 != 0) {
			System.out.println("Trung-Thuong: " + num1 / num2);
		}
		else {
			System.out.println("Trung-Khong the chia cho 0");
		}
		//Dong scanner
		scanner.close();
	}
}
