package buoi3;

import java.util.Scanner;
import buoi2.Date;

public class SinhVien {
	private String MSSV, hoten;
	private Date ngaysinh;
	private String tenHP[];
	private String diemHP[];
	private int sl_HP;
	private int max = 60;

	public SinhVien() {
		MSSV = new String();
		hoten = new String();
		ngaysinh = new Date();
		tenHP = new String[max];
		diemHP = new String[max];
	}

	public SinhVien(String MSSV1, String hoten1, Date ngaysinh1) {
		MSSV = new String(MSSV1);
		hoten = new String(hoten1);
		ngaysinh = new Date(ngaysinh1);
		sl_HP = 0;
		tenHP = new String[max];
		diemHP = new String[max];
	}

	public SinhVien(SinhVien sv) {
		MSSV = new String(sv.MSSV);
		hoten = new String(sv.hoten);
		ngaysinh = new Date(sv.ngaysinh);
		sl_HP = sv.sl_HP;
		tenHP = new String[max];
		tenHP=sv.tenHP;
		diemHP = new String[max];
		diemHP=sv.diemHP;
	}

	public void nhapSV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien:");
		MSSV = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.println("Nhap ngay sinh:");
		ngaysinh.nhap();
	}

	public void inSV() {
		System.out.println("---Thong tin sinh vien---");
		System.out.println(MSSV + " - " + hoten + " - " + ngaysinh);
		for (int i = 0; i < sl_HP; i++) {
			System.out.println("Ten hoc phan " + (i + 1) + ": " + tenHP[i] + ",diem: " + diemHP[i]);
		}
	}

	public String toString() {
		String s = "---Thong tin sinh vien---";
		for (int i = 0; i < sl_HP; i++) {
			s += ("Ten hoc phan: " + (i + 1) + " " + tenHP[i] + ",diem: " + diemHP[i]);
		}
		return s;
	}

	public void themHP(String ten, String diem) {
		Scanner sc = new Scanner(System.in);
		if (sl_HP < max - 1) {
			tenHP[sl_HP] = new String(ten);
			diemHP[sl_HP] = new String(diem);
			sl_HP++;
		}
	}

	public void xoaHP(String ten) {
		if (sl_HP <= 0) {
			System.out.println("Danh sach rong!!");
		} else {
			int i;
			for (i = 0; i < sl_HP; i++) {
				if (tenHP[i].equals(ten)) {
					for (int j = i; j < sl_HP - 1; j++) {
						tenHP[j] = tenHP[j + 1];
						diemHP[j] = diemHP[j + 1];
					}
					break;
				}
			}
			if (i == sl_HP)
				System.out.println("Mon \"" + ten + "\" khong co trong danh sach!");
			sl_HP--;

		}
	}

	public double diemTB() {
		double diem = 0.0;
		for (int i = 0; i < sl_HP; i++) {
			if (diemHP[i].equals("A"))
				diem += 4;
			else if (diemHP[i].equals("B+"))
				diem += 3.5;
			else if (diemHP[i].equals("B"))
				diem += 3;
			else if (diemHP[i].equals("C+"))
				diem += 2.5;
			else if (diemHP[i].equals("C"))
				diem += 2;
			else if (diemHP[i].equals("D+"))
				diem += 1.5;
			else if (diemHP[i].equals("D"))
				diem += 1;
			else {
				diem += 0;
			}
		}
		return diem / sl_HP;
	}
	public String layDiem(int i) {
		return diemHP[i];
	}
	public int laySL() {
		return sl_HP;
	}
	public String layHoTen() {
		return hoten;
	}
}
