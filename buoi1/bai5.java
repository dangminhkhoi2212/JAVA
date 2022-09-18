package bassic;

import java.util.Scanner;
import java.lang.Math;
public class bai5 {
	public void ptb1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a=sc.nextInt();
		System.out.print("Nhap b: ");
		int b=sc.nextInt();
		if(a==0) {
			if(b==0) {
				System.out.print("Phuong trinh vo so nghiem");
			}
			else System.out.print("Phuong trinh vo nghiem");
		}
		else {
			float x= -((float)b)/a;
			System.out.printf("Phuong trinh co nghiem x = %.2f", x);
		}
		sc.close();
	}
	public void ptb2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a=sc.nextInt();
		System.out.print("Nhap b: ");
		int b=sc.nextInt();
		System.out.print("Nhap c: ");
		int c=sc.nextInt();
		
		int delta=b*b-4*a*c;
		if(delta<0) {
			System.out.print("Phuong trinh vo nghiem");
		}
		else if(delta==0) {
			float x=-((float)b)/(2*a);
			System.out.printf("Phuong trinh co nghiem kep x = %.2f", x);
		}
		else {
			float sqrtDelta=(float)Math.sqrt(delta);
			System.out.println(sqrtDelta);
			float x1=(-b+sqrtDelta)/(2*a);
			float x2=(-b-sqrtDelta)/(2*a);
			System.out.println("Phuong trinh co 2 nghiem phan biet la:");
			System.out.printf("x1 = %.2f\n", x1);
			System.out.printf("x2 = %.2f", x2);
		}
		sc.close();
	}
	public static void main (String[] agrs) {
		bai5 pt=new bai5();
		pt.ptb2();
	}
}
