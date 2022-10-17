package buoi3;

import java.util.Scanner;

public class DSSinhVien {
	private SinhVien DS[];
	private int length;
	private int max=60;
	public DSSinhVien() {
		DS=new SinhVien[max];
		length=0;
	}
	public void themSV(SinhVien a) {
		if(length<max) {
			DS[length++]=new SinhVien(a);
		}
	}
	public int layLength() {
		return length;
	}
	public void nhapDS() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien:");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			SinhVien a=new SinhVien();
			System.out.println("Nhap sinh vien thu "+(i+1));
			
			a.nhap();
			System.out.println("Nhap ten hoc phan:");
			String tenHP=sc.nextLine();
			System.out.println("Nhap diem hoc phan:");
			String diemHP=sc.nextLine();
			a.themHP(tenHP, diemHP);
			themSV(a);
		}
	}
	public void inDS() {
		if(length==0) {
			System.out.println("Danh sach rong!!");
		}
		else {
			for(int i=0; i<length; i++) {
				System.out.println("\nSinh vien thu "+(i+1));
				DS[i].in();
			}
		}
	}
	public DSSinhVien canhCao() {
		DSSinhVien canhCao=new DSSinhVien();
		for(int i=0; i<length; i++) {
			if(DS[i].laySL()==0)
				continue;
			for(int j=0; j<DS[i].laySL(); j++) {
				if(DS[i].layDiem(j).equals("F")) {
					canhCao.themSV(DS[i]);
				}
			}
		}
		return canhCao;
	}
	public DSSinhVien maxDiemTB() {
		DSSinhVien maxDiemTB=new DSSinhVien();
		double max=-1.0;
		for(int i=0; i<length; i++)
			if(max<=DS[i].diemTB()) {
				max=DS[i].diemTB();
				maxDiemTB.themSV(DS[i]);
			}
		return maxDiemTB;
	}
	public String firstName(String name) {
		int p=name.lastIndexOf(" ");
		String firstName=name.substring(p+1);
		return firstName.toLowerCase();
	}
	public void swap(int i, int j) {
		SinhVien temp=DS[i];
		DS[i]=DS[j];
		DS[j]=temp;
	}
	public void sortName() {
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(firstName(DS[i].layHoTen()).compareTo(firstName(DS[j].layHoTen()))>0) {
					swap(i, j);
				}
			}
			
		}
	}
}
