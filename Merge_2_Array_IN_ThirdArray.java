package array;

// merge first array and second array in third array

public class Merge_2_Array_IN_ThirdArray {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {7,8,9};
		int a_length= a.length;
		int b_length= b.length;
		int c_length= a_length+b_length;
		
		int[] c= new int[c_length];
		
		System.out.println("First Array");
		
		for(int i=0; i<a.length; i++) {
			c[i]=a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Second Array");
		for(int i=0; i<b.length; i++) {
			c[a.length+i]=b[i];
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println("Merging First And Second array in third Array");
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}

	}

}
