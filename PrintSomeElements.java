package Array;

import java.util.Scanner;

public class PrintSomeElements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			}
		System.out.println();
		System.out.print(a[0]+" "+a[1]+" "+a[2]);
		
	}

}
