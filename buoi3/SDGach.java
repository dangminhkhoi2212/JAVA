package buoi3;

import java.util.Scanner;

public class SDGach {
	public void khoiTaoDS(Gach ds[], int n) {
		for(int i=0; i<n; i++)
			ds[i]=new Gach();
	}
	public void nhapDS(Gach ds[]) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<ds.length; i++) {
			System.out.println("Nhap vien gach thu "+(i+1)+":");
			ds[i].nhap();			
		}
	}
	public void hienThiDS(Gach ds[]) {
		for(int i=0; i<ds.length; i++) {
			System.out.println("Thong tin vien gach thu "+(i+1)+":");
			ds[i].in();			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Gach A=new Gach("123", "red", 10,20, 35000);
//		System.out.println(A);
		System.out.println("Nhap danh sach gach: ");
		int n=sc.nextInt();
		Gach ds[]= new Gach[n];
		SDGach SD=new SDGach();
		SD.khoiTaoDS(ds, n);
		SD.nhapDS(ds);
		SD.hienThiDS(ds);
		
	}
}
