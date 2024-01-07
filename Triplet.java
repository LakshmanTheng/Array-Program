package Array;

import java.util.Scanner;

public class Triplet {
	
	public static void main(String[] args) {
		
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Entre elements of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("enter number you want to triplet");
		int t=sc.nextInt();
		
		
		System.out.println("normal Array" );
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		
		System.out.println("triplet is =");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(a[i]+a[j]+a[k]==t) {
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
					
					
					
				}
				
			}
		}
	
	}

}
