package Array;

import java.util.Scanner;

public class EvenPosCount {

	public static void main(String[] args) {
		
		int count=0;
		
		Scanner lu=new Scanner(System.in);
		System.out.println("Array size");
		int n=lu.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=lu.nextInt();
		}
		System.out.println(" Elements Even position and count");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("count of even no is  :"+count);

	}

}
