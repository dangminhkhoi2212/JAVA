package buoi3;

import java.util.Scanner;

public class SDSinhVien {
	public void khoiTaoDS(SinhVien ds[],int n){
		for(int i=0; i<n; i++){
			ds[i]=new SinhVien();
		}
	}
	public void nhapDS(SinhVien ds[]){
		for(int i=0; i<ds.length; i++){
			System.out.println("Nhap sinh vien thu "+(i+1)+": ");
			ds[i].nhap();
//			ds[i].dangKy();
		}
	}
	public void hienThiDS(SinhVien ds[]){
		for(int i=0; i<ds.length; i++)
			ds[i].in();
	}
	public void canhCao(SinhVien ds[]){
		for(int i=0; i<ds.length; i++){
			if(ds[i].diemTB()<1.0)
				ds[i].in();
		}
	}
	public void maxDiemTB(SinhVien ds[]){
		float max=Float.MIN_NORMAL;
		int index=-1;
		for(int i=0; i<ds.length; i++){
			if(max <ds[i].diemTB()){
				max=ds[i].diemTB();
				index=i;
			}
		}
		if(index!=-1)
			ds[index].in();
	}
	public void sapXepTen(SinhVien ds[]){
		for(int i=0; i<ds.length; i++){
			for(int j=i+1; j<ds.length; j++){
				if(ds[i].layHoTen().compareTo(ds[j].layHoTen())>0){
					SinhVien temp=ds[i];
					ds[i]=ds[j];
					ds[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien:");
		int n=sc.nextInt();
		SinhVien ds[]=new SinhVien[n];
		SDSinhVien SD=new SDSinhVien();
		SD.khoiTaoDS(ds, n);
		SD.nhapDS(ds);
		SD.hienThiDS(ds);
		
		System.out.println("Sinh vien bi canh cao hoc vu:");
		SD.canhCao(ds);
		System.out.println("Sinh Vien ca diem cao nhat lop:");
		SD.maxDiemTB(ds);
		System.out.println("Danh sach sau khi sap xep:");
		SD.sapXepTen(ds);
		SD.hienThiDS(ds);
	}

}
