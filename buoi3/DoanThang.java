package buoi3;
import java.lang.Math;
import buoi2.Diem;
public class DoanThang {
	private Diem d1;
	private Diem d2;
	public DoanThang() {
		d1=new Diem();
		d2=new Diem();
	}
	public DoanThang(Diem d11,Diem d22) {
		d1=new Diem(d11);
		d2= new Diem(d22);
	}
	public DoanThang(int x1, int y1, int x2, int y2) {
		d1=new Diem(x1, y1);
		d2=new Diem(x2, y2);
	}
	public DoanThang(DoanThang D) {
		d1=new Diem(D.d1);
		d2=new Diem(D.d2);
	}
	public void nhap() {
		System.out.println("Nhap toa do d1:");
		d1.nhap();
		System.out.println("Nhap toa do d2:");
		d2.nhap();
	}
	public void hienThi() {
		System.out.println("["+d1+", "+d2+"]");
	}
	public String toString() {
		return ("["+d1+", "+d2+"]");
	}
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float doDai() {
		return d1.khoangCach(d2);
	}
	public Diem trungDiem() {
		return new Diem((d1.layHoanhDo()+d2.layHoanhDo())/2,(d1.layTungDo()+d2.layTungDo())/2);
	}
	public double goc(){
		return (Math.cos(d1.khoangCach()/ d1.layHoanhDo())*180)/Math.PI;
	}
	public Diem getD1() {
		return d1;
	}
	public Diem getD2() {
		return d2;
	}
	public void setD1(Diem d1) {
		this.d1 = d1;
	}
	public void setD2(Diem d2) {
		this.d2 = d2;
	}
}
