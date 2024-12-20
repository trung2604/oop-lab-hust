package Lab01;
import java.util.Scanner;
//Do Dinh Trung - Bai 2.2.6
public class Bai2_2_6 {
	//Ham giai phuong trinh bac nhat
	public static void linear_equation(double a, double b) {
		if(a == 0) {
			if(b == 0) {
				System.out.println("Trung-Phuong trinh co vo so nghiem");
			}
			else
				System.out.println("Trung-Phuong trinh vo nghiem");
		}
		else {
			System.out.println("Trung-Phuong trinh co nghiem la: x = " + (-b / a));
		}
	}
	//Ham giai he phuong trinh bac nhat
	public static void linear_system(double a11, double a12, double a21, double a22, double b1, double b2) {
		double D = a11 * a22 - a21 * a12;
		double D1 = b1 * a22 - b2 * a12;
		double D2 = a11 * b2 - a21 * b1;
		if(D == 0) {
			if(D1 == 0 && D2 == 0) {
				System.out.println("Trung-He phuong trinh co vo so nghiem");
			}
			else {
				System.out.println("Trung-He phuong trinh vo nghiem");
			}
		}
		else {
			System.out.println("Trung-Nghiem cua he phuong trinh la: x1 = " + D1/D + "," + "x2 = " + D2/D);
		}
	}
	//Ham giai phuong trinh bac 2
	public static void quadratic_equation(double a, double b, double c) {
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta == 0) {
			System.out.println("Trung-Phuong trinh co nghiem kep: x = " + (-b/(2*a)));
		}
		else if(delta > 0) {
			System.out.println("Trung-Phuong trinh co hai nghiem phan biet: x1 = " + ((-b + Math.sqrt(delta))/(2*a)) + "," + "x2 = " + ((-b - Math.sqrt(delta))/(2*a)));
		}
		else {
			System.out.println("Trung-Phuong trinh vo nghiem");
		}
	}
	
	public static void main(String[] args) {
		//Khoi tao doi tuong Scanner de nhap du lieu tu ban phim
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		//Tao menu chon loai phuong trinh
		while(choice != 4) {
			System.out.println("Trung-Chon loai phuong trinh: ");
			System.out.println("Trung-1: Phuong trinh bac nhat");
			System.out.println("Trung-2: He phuong trinh bac nhat");
			System.out.println("Trung-3: Phuong trinh bac hai 1 an");
			System.out.println("Trung-4: Exit");
			choice = scanner.nextInt();
			switch(choice) {
		case 1:
			System.out.println("Trung-Nhap cac he so");
			System.out.print("Trung-a: ");
			double a1 = scanner.nextDouble();
			System.out.print("Trung-b: ");
			double b1 = scanner.nextDouble();
			linear_equation(a1,b1);
			break;
		case 2:
			System.out.println("Trung-Nhap cac he so");
			System.out.print("Trung-a11: ");
			double a11 = scanner.nextDouble();
			System.out.print("Trung-a12: ");
			double a12 = scanner.nextDouble();
			System.out.print("Trung-a21: ");
			double a21 = scanner.nextDouble();
			System.out.print("Trung-a22: ");
			double a22 = scanner.nextDouble();
			System.out.print("Trung-b1: ");
			double b11 = scanner.nextDouble();
			System.out.print("Trung-b2: ");
			double b22 = scanner.nextDouble();
			linear_system(a11,a12,a21,a22,b11,b22);
			break;
		case 3:
			System.out.println("Trung-Nhap cac he so");
			System.out.print("a: ");
			double a2 = scanner.nextDouble();
			System.out.print("Trung-b: ");
			double b2 = scanner.nextDouble();
			System.out.print("Trung-c: ");
			double c = scanner.nextDouble();
			quadratic_equation(a2,b2,c);
			break;
		case 4:
			break;
		default:
			System.out.println("Trung-Lua chon khong hop le");
			break;
		}
		}
		//Dong scanner
		scanner.close();
	}
}
