package Array;
import java.util.Scanner;
public class Frequency {
	

	

	

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("entre size of array");
			int n=sc.nextInt();
			int[] a=new int[n];
			
			System.out.println("Elements");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			
			// int[] a= {1,2,3,2,1,4};
			
			int[] b=new int[a.length];
			
			for (int i = 0; i < b.length; i++) {
				b[i]=-1;
			}
			
			for (int i = 0; i < a.length; i++) {
				
				int count=1;
				
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						count++;
						b[j]=0;
						
					}	
					
				}
				if(b[i]!=0) {
					b[i]=count;
					
				}
				
				
			}
			
			for (int i = 0; i < a.length; i++) {
				
				if(b[i]!=0) {
				System.out.println(a[i]+" "+b[i]+" "+ "Times");
				}		
				
			}

		}

	}



