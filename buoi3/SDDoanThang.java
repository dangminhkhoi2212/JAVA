package buoi3;
import buoi2.Diem;
public class SDDoanThang {
	public static void main(String[] args) {
		DoanThang AB= new DoanThang(new Diem(2, 5), new Diem(20,35));
		AB.hienThi();
		System.out.println("Tinh tien AB:");
		AB.tinhTien(5, 3);
		System.out.println(AB);
		DoanThang CD= new DoanThang();
		CD.nhap();
		CD.hienThi();
		System.out.println("Tung diem CD:"+CD.trungDiem());
		System.out.printf("Do dai CD: %.2f" ,CD.doDai());
	}
}
