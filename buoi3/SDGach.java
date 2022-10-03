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
	public Gach chiPhiMin(Gach ds[]) {
		float min=Float.MAX_VALUE;
		Gach g=new Gach(ds[0]);
		for(int i=0; i<ds.length; i++) {
			float chiPHi=ds[i].giaBanLe()/ds[i].dienTich();
			if(min > chiPHi) {
				min=chiPHi;
				g=new Gach(ds[i]);
			}
		}
		return g;
	}
	public void tinhChiPhi(Gach ds[], int d, int r) {
		for(int i=0; i<ds.length; i++) {
			long gia=(long)ds[i].soLuongHop(d, r)*ds[i].layGia();
			System.out.println("Gia cua hop gach thu "+(i+1)+" khi loat dien tich "+d+" x "+r+" la: "+gia);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Gach A=new Gach("1", "red", 4,5,10, 30000);
		Gach B=new Gach("2", "blue", 3,5,12, 25000);
		Gach C=new Gach("3", "green", 3,6,15, 35000);
//		System.out.println(A);
		System.out.println("Nhap danh sach gach: ");
		int n=sc.nextInt();
		Gach ds[]= new Gach[n];
		SDGach SD=new SDGach();
		SD.khoiTaoDS(ds, n);
//		SD.nhapDS(ds);
		ds[0]=new Gach(A);
		ds[1]=new Gach(B);
		ds[2]=new Gach(C);
		SD.hienThiDS(ds);
		
		System.out.println("Loai gach co chi phi loat thap nhat:");
		System.out.println(SD.chiPhiMin(ds));	
		SD.tinhChiPhi(ds, 5, 20);
		
	}
}
