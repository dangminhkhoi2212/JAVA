package buoi4;

import java.util.Scanner;

public class SDSVCNTT {
	public void khoiTaoDS(SinhVienCNTT ds[]) {
		for(int i=0; i<ds.length; i++)
			ds[i]=new SinhVienCNTT();
	}
	public void nhapDS(SinhVienCNTT ds[]) {
		for(int i=0; i<ds.length; i++) {
			System.out.println("Nhap thong tin sinh vien thu "+ (i+1)+" :");
			ds[i].nhapSV();
			ds[i].dangKy();
		}
	}
	public void inDS(SinhVienCNTT ds[]) {
		for(int i=0; i<ds.length; i++) {
			ds[i].inSV();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien:");
		int n=Integer.parseInt(sc.nextLine());
		SDSVCNTT SD=new SDSVCNTT();
		SinhVienCNTT ds[]=new SinhVienCNTT[n];
		SD.khoiTaoDS(ds);
		SD.nhapDS(ds);
		SD.inDS(ds);
		
	}

}
