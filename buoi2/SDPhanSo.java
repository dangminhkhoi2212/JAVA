package buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public void nhapDS(PhanSo ds[], int n) {
		for(int i=0; i<n; i++){
			ds[i]=new PhanSo();
			System.out.println("Nhap phan so "+ (i+1));
			ds[i].nhap();
		}
	}
	public void inDS(PhanSo ds[]) {
		for(int i=0; i<ds.length; i++){
			System.out.println("Phan so thu "+(i+1)+" la:");
			ds[i].in();
		}
	}
	public PhanSo tongDS(PhanSo ds[]) {
		PhanSo tong=new PhanSo();
		tong=ds[0];
		for(int i=1; i<ds.length; i++){
			tong=tong.Cong(ds[i]);
		}
		return tong;
	}
	public PhanSo maxPhanso(PhanSo ds[]) {
		PhanSo max=ds[0];
		for(int i=1; i<ds.length; i++)
			if(max.giaTriThuc()<ds[i].giaTriThuc())
				max=ds[i];
		return max;
	}
	
	public void sapXep(PhanSo ds[]) {
		SDPhanSo sd=new SDPhanSo();
		for(int i=0; i<ds.length; i++)
			for(int j=i+1; j<ds.length; j++)
				if(ds[i].giaTriThuc()>ds[j].giaTriThuc()) {
					PhanSo temp=ds[i];
					ds[i]=ds[j];
					ds[j]=temp;
				}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		PhanSo A=new PhanSo(3,7);
//		PhanSo B=new PhanSo(4,9);
//		System.out.println("Phan so A:");
//		A.in();
//		System.out.println("Phan so B:");
//		B.in();
		
//		PhanSo x=new PhanSo();
//		System.out.println("Nhap phan so x:");
//		x.nhap();
//		PhanSo y=new PhanSo();
//		System.out.println("Nhap phan so y:");
//		y.nhap();
//		System.out.println("Phan so X:");
//		x.in();
//		System.out.println("Phan so Y:");
//		y.in();
		
//		PhanSo temp=new PhanSo();
//		System.out.println("Phan so nghich dao cua X;");
//		PhanSo temp=new PhanSo();
//		temp=x;
//		x.nghichDao();
//		x.in();
//		x=temp;
		
//		System.out.println("Ket qua x+y la:");
//		temp=x.Cong(y);
//		temp.in();
//		
		SDPhanSo sd=new SDPhanSo();
		System.out.println("Nhap so luong mang:");
		int n=sc.nextInt();
		PhanSo ds[]=new PhanSo[n];
		sd.nhapDS(ds, n);
		sd.inDS(ds);
//		
//		System.out.println("Tong phan so trong danh sach la:");
//		sd.tongDS(ds).in();
		
//		System.out.println("Phan so lon nhat trong mang: ");
//		sd.maxPhanso(ds).in();
		
		System.out.println("Danh Sach sau khi sap xep:");
		sd.sapXep(ds);
		sd.inDS(ds);
	}

}


