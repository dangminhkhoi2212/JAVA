package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tu, mau;
	public PhanSo(){
		tu=mau=1;
	}
	public PhanSo(int tu1, int mau1){
		tu=tu1;
		mau=mau1;
		dinhDang();
	}
	public void nhap(){
		Scanner sc=new Scanner(System.in);
		while(true){
			try{
				System.out.println("Nhap tu so:");
				tu=Integer.parseInt(sc.nextLine());
				System.out.println("Nhap mau so:");
				mau=Integer.parseInt(sc.nextLine());
				if(mau!=0)
					break;
				else System.out.println("Loi mau so bang 0! Hay nhap lai:");
			}catch(Exception e){
				System.out.println("Loi!Hay nhap lai:");
			}
		}
	}
	public void dinhDang(){
		if(tu<0 && mau<0){
			tu=-tu;
			mau=-mau;	
		}
	}
	public void in(){
		if(tu==0)
			System.out.println(0);
		else if(mau==1)
				System.out.println(mau);
		else if(tu%mau==0)
				System.out.println(tu/mau);
		else System.out.println(tu+"/"+mau);
	}
	public void nghichDao(){
		tu=-tu;
	}
	public PhanSo giaTriNghichDao(){
		PhanSo A=new PhanSo(tu, mau);
		A.nghichDao();
		return A;
	}
	public float giaTriThuc(){
		return (float)tu/mau;
	}
	public boolean lonHon(PhanSo b){
		PhanSo a=new PhanSo(tu, mau);
		return a.giaTriThuc()>b.giaTriThuc();
	}
	public PhanSo Cong(PhanSo b){
		PhanSo ketqua=new PhanSo(tu, mau);
		if(ketqua.mau!=b.mau){
			ketqua.tu=(ketqua.tu*b.mau)+(ketqua.mau*b.tu);
			ketqua.mau=ketqua.mau*b.mau;
		}
		else ketqua.tu+=b.tu;
		return ketqua;
	}
	public PhanSo Tru(PhanSo b){
		PhanSo ketqua=new PhanSo(tu, mau);
		if(ketqua.mau!=b.mau){
			ketqua.mau=ketqua.mau*b.mau;
			ketqua.tu=(ketqua.tu*b.mau)-(ketqua.mau*b.tu);
		}
		else ketqua.tu-=b.tu;
		return ketqua;
	}
	public PhanSo Nhan(PhanSo b){
		PhanSo ketqua=new PhanSo();
		ketqua.tu=ketqua.tu*b.tu;
		ketqua.mau=ketqua.mau*b.mau;
		return ketqua;
	}
	public PhanSo Chia(PhanSo b){
		PhanSo ketqua=new PhanSo();
		ketqua.tu=ketqua.tu/b.tu;
		ketqua.mau=ketqua.mau/b.mau;
		return ketqua;
	}
	public PhanSo congSoNguyen(int n){
		PhanSo A=new PhanSo(n, 1);
		PhanSo ketqua=new PhanSo(tu, mau);
		return ketqua.Cong(A);
	}
	public PhanSo swap(PhanSo p1) {
		PhanSo temp=p1;
		tu=p1.tu;
		mau=p1.mau;
		return temp;
	}
}
