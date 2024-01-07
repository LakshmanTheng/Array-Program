package Array;

import java.util.Scanner;

public class EvenOddint {

	public static void main(String[] args) {
		
		int i;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Size array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elements");
		for(i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
		
		System.out.println("Even integer");
		for(i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd integer");
		for(i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
