package Array;

import java.util.Scanner;

public class Evenno {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("even no is");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				System.out.print(a[i]+" ");
				
			}
			
			}
		System.out.println();
		System.out.println("Odd no");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
				
			}
		}

	}

}
