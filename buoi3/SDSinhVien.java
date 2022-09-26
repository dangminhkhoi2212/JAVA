package buoi3;

import java.util.Scanner;
import buoi2.Date;

public class SDSinhVien {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		SinhVien a=new SinhVien();
//		a.nhapSV();
//		a.themHP("LTHDT", "A");
//		a.inSV();
//		System.out.println(String.format("%.2f",a.diemTB()));
		
		
		
		DSSinhVien DS=new DSSinhVien();
		SinhVien a=new SinhVien("1", "Minh Khoi", new Date(2,2,2002));
		a.themHP("CT1","A");
		SinhVien b=new SinhVien("2", "an", new Date(3,2,2002));
		b.themHP("CT2","F");
		b.themHP("CT3","B");
		SinhVien c=new SinhVien("3", "zu", new Date(4,2,2002));
		c.themHP("CT4","A");
		
		DS.themSV(a);
		DS.themSV(b);
		DS.themSV(c);
//		DS.nhapDS();
		DS.inDS();
		
		DSSinhVien canhCao=DS.canhCao();
		System.out.println("\n***DANH SACH SINH VIEN BI CANH CAO***" );
		canhCao.inDS();
		
		DSSinhVien maxDiemTB=DS.maxDiemTB();
		System.out.println("\n***DANH SACH SINH VIEN CO DIEM TRUNG BINH CAO NHAT***" );
		maxDiemTB.inDS();
		
		System.out.println("\n**DANH SACH SINH VIEN SAU KHI SAP SEP***");
		DS.sortName();
		DS.inDS();
		
	}

}
