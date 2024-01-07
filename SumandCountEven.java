package Array;

import java.util.Scanner;

public class SumandCountEven {

	public static void main(String[] args) {
		
		int count=0;
		int sum=0;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Size of Array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Normal Array");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				sum=sum+a[i];
				
				count++;
			System.out.print(a[i]+" ");
			}
		}
		
		System.out.println();
		System.out.println(sum);
		System.out.println(count);
		
		

	}

}
