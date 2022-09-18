package bassic;
import java.util.Scanner;
public class bai4 {
	public int sum(int a, int b) {
		return a+b;
	}
	public int input() {
		Scanner sc=new Scanner(System.in);
		int n=0;
		do{
			try{
				System.out.println("Nhap 1 so nguyen:");
//				String s=sc.nextLine();
//				n=Integer.parseInt(s);
				n=Integer.parseInt(sc.nextLine());
			}
			catch(Exception e) {
				System.out.println("Ban nhap sai , hay nhap lai:");
				n=Integer.MAX_VALUE;
			}
		}while(n==Integer.MAX_VALUE);
		return n;
		
	}
	public static void main (String[] args) {
		bai4 sn=new bai4();
		int a=sn.input();
		int b=sn.input();
		System.out.println("Tong hai so nguyen la: "+ sn.sum(a, b));
	}
}
