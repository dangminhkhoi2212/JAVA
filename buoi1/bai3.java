package bassic;
public class bai3 {
	public static void main(String args[]) {
		String a[]= {"20", "30", "15c", "90", "df2143"};
		double tong=0.0, d, max=Double.MIN_VALUE;
		
		for(String num: a) {
			try {
				d=Double.parseDouble(num);
			}
			catch(Exception e) {
				d=0;
			}
			if(d>max)
				max=d;
			tong+=d;
		}
		System.out.println("So lon nhat trong mang la: "+max);
		System.out.println("Tong day so la: "+  tong);
	}

	
}
