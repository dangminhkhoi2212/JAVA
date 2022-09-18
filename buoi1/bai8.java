package bassic;
import java.util.Scanner;
public class bai8 {
	int nums[];
	public void importNumbers() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap so luong so nguyen: ");
		int n=sc.nextInt();
		nums=new int[n];
		for(int i=0; i<n; i++) {
			int x=sc.nextInt();
			nums[i]=x;
		}
	}
	public void printNumbers() {
		System.out.println("Day so cua mang:");
		for(int num: nums)
				System.out.print(num+ " ");
		System.out.println();
	}
	public int countX(int x) {
		int dem=0;
		for(int num: nums)
			if(num==x)
				dem++;
		return dem;
	}
	
	public void swap(int i,int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	public void sort() {
		for(int i=0; i<nums.length; i++)
			for(int j=i+1; j<nums.length; j++)
				if(nums[i]>nums[j])
					swap(i, j);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		bai8 number=new bai8();
		number.importNumbers();
		number.printNumbers();
		System.out.println("Mang sau khi sap xep:");
		number.sort();
		number.printNumbers();
		System.out.println("Nhap so X: ");
		int x=sc.nextInt();
		System.out.printf("Co %d so %d trong mang", number.countX(x), x);
		
	}
}
