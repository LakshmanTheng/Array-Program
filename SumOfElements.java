package Array;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner (System.in);
		
		int n=sc.nextInt();
		System.out.println("Size of Array");
		int[] a=new int[n];
		
		System.out.println("Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Sum of 1st 2nd and 3rd index");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(a[0]+a[1]+a[2]);
	}

}
