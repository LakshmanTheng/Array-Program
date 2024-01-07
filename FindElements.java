package Array;

import java.util.Scanner;

public class FindElements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print(" is a positive no " );
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				System.out.print(a[i]+" ");
			
			}
			
		}
		System.out.println();
		System.out.print(" is a Negative no " );
			for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.print("a[0] is  "+a[0]);
		
	}

}
