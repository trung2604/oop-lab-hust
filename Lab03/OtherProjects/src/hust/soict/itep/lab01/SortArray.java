package hust.soict.itep.lab01;
import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		double sum = 0;
		double average;
		System.out.print("Nhap mang: ");
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		Arrays.sort(a);
		average = sum/a.length;
		System.out.println("Mang da duoc sap xep la: " + Arrays.toString(a));
		System.out.println("Tong cac gia tri trong mang la: " + sum);
		System.out.println("Trung binh cong cac gia tri trong mang la: " + average);
		sc.close();
	}
}
