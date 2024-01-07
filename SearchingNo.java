package abstractin;

import java.util.Scanner;

public class SearchingNo extends SearchingNo2 {

	public  void count() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Entre elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Normal Array");
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("Enter  elements for search");
		
		
		int search=0;
		int count=0;
		search=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==search) {
				count++;
			}
		
		}
		if(count>0) {
			System.out.println(search+" elemenet found "+ count+" Times");
		}
		else {
			System.out.println("Element not found");
		}
		
	}

}
