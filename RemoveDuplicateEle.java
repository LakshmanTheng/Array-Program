package Array;

import java.util.Scanner;

public class RemoveDuplicateEle {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of Array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Normal Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("Delete Duplicate Array");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]){
					
					a[i]=-1;
				}
			}
		}
					
			
		for(int i=0;i<a.length;i++) {
			if(a[i]!=-1) {
				System.out.print(a[i]+" ");
			}
			
		}
		
		

		}

}

