package Array;

import java.util.Scanner;

public class CommonElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of first array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		
		
		System.out.println("Elements of first array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Size of Second array");
		int n1=sc.nextInt();
		int[] b=new int[n1];
		
		System.out.println("Elements of Second array");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		
		System.out.println("Common Elements ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}
			}
			}
		}
	}


