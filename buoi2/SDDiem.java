package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem A=new Diem(3,4);
		System.out.print("Toa do diem A: ");
		A.hienThi();
//		Diem B=new Diem();
//		B.nhapDiem();
//		System.out.print("Toa do diem B: ");
//		B.hienThi();
//		Diem C=new Diem();
//		C.diemDoiXung(B);
//		System.out.print("Toa do diem C: ");
//		C.hienThi();
//		
//		System.out.print("Khoang cach tu B den tam O la: " +B.khoangCach());
//		System.out.println();
//		System.out.print("Khoang cach tu A den B la: "+ A.khoangCach(B));
		A.doiDiem(3, 3);
		A.hienThi();
		
	}
}
