package buoi3;

import java.util.Scanner;

public class Gach {
	private String maso;
	private String mau;
	private int cd,cr;
	private static int n;
	private long gia;
	
	public Gach(){
		maso=mau="";
		cd=cr=0;
		gia=0;
		n++;
	}
	public Gach(String maso1,String mau1,int cd1, int cr1) {
		maso=maso1;
		mau=mau1;
		cd=cd1;
		cr=cr1;
		n++;
	}
	public Gach(Gach g) {
		maso=g.maso;
		mau=g.mau;
		cd=g.cd;
		cr=g.cr;
		n++;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma so vien gach:");
		maso=sc.nextLine();
		System.out.println("Nhap mau vien gach:");
		mau=sc.nextLine();
		System.out.println("Nhap chieu dai va chieu rong vien gach:");
		cd=sc.nextInt();
		cr=sc.nextInt();
		System.out.println("Nhap gia cua vien gach");
		gia=sc.nextLong();
	}
	public void in() {
		System.out.println("Ma so vien gach: "+maso+"\nMau cua vien gach: "+mau
				+"\nChieu dai: "+cd+"\nChieu rong: "+cr+"\nGia: "+gia);
	}
	public String toString() {
		return ("Ma so vien gach: "+maso+"\nMau cua vien gach: "+mau
				+"\nChieu dai: "+cd+"\nChieu rong: "+cr+"\nGia: "+gia);
	}
	public float giaBanLe() {
		float gia_ban_le=(float)(gia+(float)gia*0.2);
		return gia_ban_le/n;
	}
	public float dienTich() {
		return (float)(cd*cr)*n;
	}
	public float soLuongHop(int D, int N) {
//		Code tham khao tren mang
//		float slvDai=(float)D/cd;
//		if((float)D/cd>0)
//			slvDai++;
//		float slvNgang=(float)N/cr;
//		if((float)N/cr>0)
//			slvNgang++;
//		float tongSoVien=slvDai*slvNgang;
//		float soHop=tongSoVien/n;
//		if(tongSoVien%n>0)
//				soHop++;
//		return soHop;
		
		//Code tu viet
		float soHop=(D*N)/dienTich();
		if((D*N)%dienTich()>0)
			soHop++;
		return soHop;
				
	}
	
}
