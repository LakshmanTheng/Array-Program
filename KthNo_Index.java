package Array;
import java.util.*;

public class KthNo_Index {

		public static void main(String args[]) {
		

			int temp=0;
					 
			  Scanner sc=new Scanner(System.in);
			  System.out.println(" Entere the size");
			  int n=sc.nextInt();
			  int[] a=new int[n];
			  
			  System.out.println("enetere elements");
			  for(int i=0;i<a.length;i++) {
				  a[i]=sc.nextInt();
				   }
			  			System.out.println("Ascending order");
				
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
			
				
			}
		}




