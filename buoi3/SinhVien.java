package buoi3;
import java.util.Scanner;

import buoi2.Date;
public class SinhVien {
	private String mssv;
	private String hoten;
	private Date ngSinh;
	private int sl;
	private String tenHP[];
	private String diemHP[];
	private int max=60;
	public SinhVien(){
		mssv=new String();
		hoten=new String();
		ngSinh=new Date();
		sl=0;
		tenHP=new String[max];
		diemHP=new String[max];
	}
	public SinhVien(SinhVien a){
		mssv=new String(a.mssv);
		hoten=new String(a.hoten);
		ngSinh=new Date(a.ngSinh);
		sl=a.sl;
		for(int i=0; i<a.sl; i++){
			tenHP[i]=new String(a.tenHP[i]);
			diemHP[i]=new String(a.diemHP[i]);
		}
	}
	public void nhap(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien:");
		mssv=sc.nextLine();
		System.out.println("Nhap ten sinh vien:");
		hoten=sc.nextLine();
		System.out.println("Nhap ngay sinh:");
		ngSinh.nhap();
	}
	public void in(){
		System.out.println("---Thong tin sinh vien----");
		System.out.println(mssv+" - "+hoten+" - "+ngSinh);
		for(int i=0; i<sl; i++){
			System.out.println("Ten hoc phan: "+ tenHP[i]+", diem: "+diemHP[i]);
		}
	}
	public String toString(){
		String s="---Thong tin sinh vien----\n";
		s+=(mssv+" - "+hoten+" - "+ngSinh+"\n");
		for(int i=0; i<sl; i++){
			s+=("Ten hoc phan: "+ tenHP[i]+", diem: "+diemHP[i]+"\n");
		}
		return s;
	}
	public void themHP(String ten, String diem){
		if(sl<max){
			tenHP[sl]=new String(ten);
			diemHP[sl]=new String(diem);
			sl++;
		}
		else System.out.println("Danh sach hoc phan da day!");
	}
	public void xoaHP(String ten){
		if(sl==0)
			System.out.println("Danh sach hoc phan rong!");
		else{
			int i;
			for(i=0; i<sl; i++){
				if(tenHP[i].equals(ten)){
					break;
				}
			}
			if(i<sl){
				int j;
				for(j=i;j<sl-1; j++){
					tenHP[j]=new String(tenHP[j+1]);
					diemHP[j]=new String(diemHP[j+1]);
				}
				sl--;
			}
			else System.out.println("Khong tim thay hoc phan "+ten+" !");
			
		}
	}
	public void dangKy(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong hoc phan muon them:");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++){
			System.out.println("Nhap ten hoc phan thu"+(i+1)+" :");
			String tenHP=sc.nextLine();
			System.out.println("Nhap diem hoc phan:");
			String diemHP=sc.nextLine();
			themHP(tenHP, diemHP);
		}
	}
	public float diemTB(){
		float avg=0.0f;
		for(int i=0; i<sl; i++){
			if(diemHP[i].equals("A"))
				avg+=4;
			else if(diemHP[i].equals("B+"))
				avg+=3.5;
			else if(diemHP[i].equals("B"))
				avg+=3;
			else if(diemHP[i].equals("C+"))
				avg+=2.5;
			else if(diemHP[i].equals("C"))
				avg+=2;
			else if(diemHP[i].equals("D+"))
				avg+=1.5;
			else if(diemHP[i].equals("D"))
				avg+=1;
			else if(diemHP[i].equals("F"))
				avg+=0;
		}
		return avg/sl;
	}
	public String layHoTen(){
		int p=hoten.lastIndexOf(" ");
		String ten=hoten.substring(p+1);
		return ten;
	}
	public int laySL() {
		return sl;
	}
	public String layDiem(int i) {
		return diemHP[i];
	}
}
