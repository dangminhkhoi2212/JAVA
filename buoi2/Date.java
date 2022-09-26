package buoi2;

import java.util.Scanner;

public class Date {
	private int d, m, y;
	public Date(){
		d=m=y=1;
	}
	public Date(int d1, int m1, int y1){
		d=d1;
		m=m1;
		y=y1;
	}
	public Date(Date date) {
		d=date.d;
		m=date.m;
		y=date.y;
	}
	public void hienThi(){
		System.out.println(d+"/"+m+"/"+y);
	}
	public String toString() {
		return (d+"/"+m+"/"+y);
	}
	public boolean namNhuan(){
		if((y%4 ==0 && y%100!=0) || y%400==0)
			return true;
		return false;
	}
	public boolean hopLe(){
		int ngay[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(namNhuan())
			ngay[2]=29;
		if(d<0 || d>ngay[m] || m<0 || m>12 || y<1)
			return false;
//		if(d>0 && d<=ngay[m] && m>0 && m<13 && y>0)
//			return true;
		return true;
	}
	public void nhap(){
		Scanner sc=new Scanner(System.in);
		do{
			System.out.print("Nhap ngay: ");
			d=sc.nextInt();
			System.out.print("Nhap thang: ");
			m=sc.nextInt();
			System.out.print("Nhap nam: ");
			y=sc.nextInt();
		}while(!hopLe());
	}
	public Date congNgay(){
		Date homSau=new Date(d, m, y);
		(homSau.d)++;
		if(!homSau.hopLe()){
			homSau.d=1;
			homSau.m++;
			if(!homSau.hopLe()){
				homSau.m=1;
				homSau.y++;
			}
		}
		return homSau;
	}
	public Date congNgay(int n){
		Date ngayMoi=new Date(d, m, y);
		for(int i=1; i<=n; i++){
			ngayMoi=ngayMoi.congNgay();
		}
		return ngayMoi;
	}
}
