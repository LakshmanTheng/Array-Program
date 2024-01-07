package array;
// sum of element in array

public class Sum_Array {
	

	public static void main(String[] args) {
		

		int[] a= {3,5,6,2,7,4};
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
		System.out.println();
		System.out.println("Sum is : "+sum);
	
	}

}
