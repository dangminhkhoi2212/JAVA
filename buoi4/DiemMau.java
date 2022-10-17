package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem{
	private String mau;
	public DiemMau() {
		super();
		mau=new String();
	}
	public DiemMau(int x, int y, String mau1) {
		super(x, y);
		mau=new String(mau1);
	}
	public DiemMau(DiemMau M) {
		super(M);
		mau=new String(M.mau);
	}
	public void ganMau(String mau1) {
		mau= new String(mau1);
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap mau:");
		Scanner sc=new Scanner(System.in);
		mau= sc.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.println("Mau cua diem la mau: "+mau);
	}
	public String toString() {
		return super.toString()+ ("Mau cua diem la mau: "+mau);
	}
}
