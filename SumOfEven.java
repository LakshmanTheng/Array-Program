package Array;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Size");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elemengts");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Sum of even no is");
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
				
			}
		}
		System.out.print(sum);
	}

}
