package Array;
import java.util.*;
public class Copy1Arrto2ndarr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Elements of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("First array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("same as first array size");
		int n1=sc.nextInt();
		int[] b=new int[n];
		
		
		
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
		
		

	}

}
