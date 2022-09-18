package buoi2;

import java.util.Scanner;

public class SDDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date A=new Date(13,9,2022);
		Date B=A;
		System.out.println("Ngay hom nay la:");
		A.hienThi();
		System.out.println("Ngay hom sau la:");
		B=B.ngayHomSau();
		B.hienThi();
		
		System.out.println("Nhap ngay muon den:");
		int n=sc.nextInt();
		System.out.println(n+ " ngay nua la ngay: ");
		A=A.congNgay(n);
		A.hienThi();
		
		Date C=new Date();
		C.nhap();
		C.hienThi();
	}
}
