package abstractin;

import java.util.Scanner;

public class secondclass extends FirstClass
{
	Scanner sc=new Scanner(System.in);

	@Override
	public void disp() 
	{
		System.out.println("enter size of arry");
		System.out.println();
		int n=sc.nextInt();
		int[] a=new int[n];
		
		
		System.out.println("Elemnts of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("For normal array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Ascending array");
		int temp=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
			}
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println("Decending array");
		int temp1=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {	
				temp1=a[i];
				a[i]=a[j];
				a[j]=temp1;
				
				}
			}
			System.out.print(a[i]+" ");		
	}
			
	}
}
