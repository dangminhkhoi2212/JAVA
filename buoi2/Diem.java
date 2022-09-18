package buoi2;

import java.util.Scanner;
import java.lang.Math;
public class Diem {
	private int x, y;

	public Diem(){
		x=y=0;
	}
	public Diem(int x1, int y1){
		x=x1;
		y=y1;
	}
	
	public void  nhapDiem(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap toa do x: ");
		x=sc.nextInt();
		System.out.println("Nhap toa do y: ");
		y=sc.nextInt();
	}
	public void hienThi(){
		System.out.println("(" +x+", "+y+")");
	}
	public void doiDiem(int dx, int dy){
		x+=dx;
		y+=dy;
	}
	public int layHoanhDo(){
		return x;
	}
	public int layTungDo(){
		return y;
	}
	public float khoangCach(){
		return (float)Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
	}
	public float khoangCach(Diem d){
		return (float)Math.sqrt(Math.pow(d.x-x, 2)+Math.pow(d.y-y, 2));
	}
	public void diemDoiXung(Diem d){
		x=-d.x;
		y=-d.y;
	}
}
