package Array;

import java.util.Scanner;

public class Decending {
		
		static int temp;
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Entre the size of array");
				int n=sc.nextInt();
				int[] a=new int[n];
				
				System.out.println(" Entre elements");
				for(int i=0;i<a.length;i++) {
					a[i]=sc.nextInt();
				}
				System.out.println("Ascending Order");
				for(int i=0;i<a.length;i++) {
					for(int j=i+1;j<a.length;j++) {
						if(a[i]<a[j]) {
							
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						
							
						}
					}
					System.out.print(a[i]+" ");
				}

	}

}
