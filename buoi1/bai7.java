package bassic;
import java.util.Scanner;
public class bai7 {
	public String nhapTen() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap ten cua ban: ");		
		String hoten=sc.nextLine();
		return hoten;
	}
//	public void last_name(String name) {
//		String[] output=name.split(" ");
//		int length=output.length;
//		System.out.print("Ten cua ban la: " +output[length-1]);
//	}
	public void last_name(String hoten) {
		int p=hoten.lastIndexOf(" ");
		String ten=hoten.substring(p+1);
		System.out.println("Ten cua ban la: "+ ten);
	}
	public static void main(String[] args) {
		bai7 name=new bai7();
		String hoten=name.nhapTen();
		name.last_name(hoten);
	}
}
