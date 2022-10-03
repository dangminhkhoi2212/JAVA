package buoi3;

import java.util.Scanner;

public class Gach {
	private String maso;
	private String mau;
	private int cd,cr;
	private int sl;
	private long gia;
	
	public Gach(){
		maso=new String();
		mau=new String();
		cd=cr=0;
		gia=0;
		sl=0;
	}
	public Gach(String maso1, String mau1, int cd1, int cr1, int sl1, long gia1) {
		maso=new String (maso1);
		mau=new String(mau1);
		cd=cd1;
		cr=cr1;
		sl=sl1;
		gia=gia1;
	}
	public Gach(Gach g) {
		maso=new String (g.maso);
		mau=new String(g.mau);
		cd=g.cd;
		cr=g.cr;
		sl=g.sl;
		gia=g.gia;
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
		System.out.println("Nhap so luong vien gach:");
		sl=sc.nextInt();
		System.out.println("Nhap gia cua 1 hop:");
		gia=sc.nextLong();
	}
	public void in() {
		System.out.println("Ma so vien gach: "+maso+"\nMau cua vien gach: "+mau
				+"\nChieu dai: "+cd+"\nChieu rong: "+cr+"\nGia: "+gia+"\n---------o--------");
		
	}
	public String toString() {
		return ("Ma so vien gach: "+maso+"\nMau cua vien gach: "+mau
				+"\nChieu dai: "+cd+"\nChieu rong: "+cr+"\nGia: "+gia+"\n---------o--------");
	}
	public float giaBanLe() {
		float gia_ban_le=(float)(gia+(float)gia*0.2);
		return gia_ban_le/sl;
	}
	public int dienTich() {
		return (cd*cr)*sl;
	}
	public float soLuongHop(int D, int N) {
		float slvDai=(float)D/cd;
		if((float)D/cd>0)
			slvDai++;
		float slvNgang=(float)N/cr;
		if((float)N/cr>0)
			slvNgang++;
		float tongSoVien=slvDai*slvNgang;
		float soHop=tongSoVien/sl;
		if(tongSoVien%sl>0)
				soHop++;
		return soHop;			
	}
	public long layGia() {
		return gia;
	}
	
}
