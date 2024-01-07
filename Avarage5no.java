package Array;

import java.util.Scanner;

public class Avarage5no {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("First 5 no avarage is");
		for(int i=0;i<a.length;i++) {
			
		}
		System.out.print((a[0]+a[1]+a[2]+a[3]+a[4])/5);

	}

}
