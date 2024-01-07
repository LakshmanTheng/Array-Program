package Array;
import java.util.Scanner;
public class SearchArray {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
			System.out.println("Size of array");
			int n=sc.nextInt();
			int[] a=new int[n];
			
			System.out.println("Elements of array");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			
			System.out.print("Normal Array");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			System.out.println("Duplicate Ellements in array");
			
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						System.out.print(a[i]+" ");
					}
				}
				System.out.println();
			}
			
			
		}

	}


