package hust.soict.itep.lab01;

import java.util.Scanner;

public class SumMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so hang cua ma tran: ");
		int n = sc.nextInt();
		System.out.print("Nhap so cot cua ma tran: ");
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		int[][] c = new int[n][m];
		System.out.println("Nhap ma tran thu nhat: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Nhap ma tran thu hai: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Ma tran tong cua hai ma tran la:");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
