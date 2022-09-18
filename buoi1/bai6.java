package bassic;
import java.lang.Math;
import java.util.Scanner;
public class bai6 {
	public void binary(int x) {
		if(x==0)
			return;
		int b=x%2;
		x/=2;
		binary(x);
		System.out.print(b);

	}
	public boolean check_prime(int x) {
		int i;
		if(x==1)
			return true;
		else if(x==2)
				return false;
		float sqrtX= (float)Math.sqrt(x);
		for(i=2; i<=sqrtX; i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		bai6 prime=new bai6();
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen: ");
		int x=sc.nextInt();
		boolean check=prime.check_prime(x);
		if(check)
			System.out.println("La so nguyen to");
		else System.out.println("Khong la so nguyen to");
		System.out.println("So nhi phan la "+ Integer.toBinaryString(x));
		prime.binary(x);
		sc.close();
	}
}
