package abstractin;

import java.util.Scanner;

public class MaxMinDiff extends MaxMinDiff_1{
	
	Scanner sc=new Scanner(System.in);
	public void difference() {
	
		
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Enetre elements of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Normal array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		
		}
		System.out.println();
		System.out.println(" sort in Ascending order");
		
		for(int i=0;i<a.length;i++) {
			int temp=0;
			
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
				}
				System.out.print(a[i]+" ");
			}
		System.out.println();
		System.out.println(" Difference between max no and min no");
		
		for(int i=0;i<a.length;i++) {
			
				
			
			
		
		
		}
		System.out.println(a[a.length-1]-a[0]);
					
		}
}
		
	


