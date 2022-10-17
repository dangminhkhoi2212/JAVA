package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String taikhoan;
	private String matkhau;
	private String email;
	
	public SinhVienCNTT() {
		super();
		taikhoan=new String();
		matkhau=new String();
		email=new String();
	}
	public SinhVienCNTT(SinhVienCNTT a) {
		super(a);
		taikhoan=new String(a.taikhoan);
		matkhau=new String(a.matkhau);
		email=new String(a.email);
	}
	public void nhapSV() {
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap tai khoan:");
		taikhoan=sc.nextLine();
		System.out.println("Nhap mat khau:");
		matkhau=sc.nextLine();
		System.out.println("Nhap email:");
		email=sc.nextLine();
	}
	public void inSV() {
		super.in();
		System.out.println("Tai khoan: "+taikhoan+", email: "+email);
	}
	public String toString() {
		return super.toString() + "Tai khoan: "+taikhoan+", email: "+email+"\n";
	}
	public void doiMatKhau(String newPass) {
		matkhau=new String(newPass);
	}
	public String layEmail() {
		return email;
	}
}
