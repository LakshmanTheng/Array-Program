package Array;

import java.util.Scanner;

public class SecondSmallNo {
	
public static void main(String[] args) {
		
		int i,j;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elements of array");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		
		System.out.println("Normal array");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("Ascending no");
		int temp=0;
		for( i=0;i<a.length;i++)
		{
		for( j=i+1;j<a.length;j++)
		{
		      if(a[i]>a[j]){
		      temp =a[i];	
		      a[i]=a[j];
		      a[j]=temp;
		      }
		     }
		 System.out.print(a[i]+" ");
			
		
		}
		System.out.println("Second Smallest no is");
		
		System.out.print(a[1]);
		
	}


}
