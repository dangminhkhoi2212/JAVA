package buoi4;

import buoi2.Diem;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau A=new DiemMau(5,10,"trang");
//		A.hienThi();
//		System.out.println(A);
		DiemMau B=new DiemMau();
		B.nhap();
		B.doiDiem(10, 8);
		B.hienThi();
		B.ganMau("Vang");
		B.hienThi();
		
	}

}
