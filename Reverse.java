package array;
// reverse of elements in array

public class Reverse {

	public static void main(String[] args) {
	
		int[] a= {5,3,6,2,4};
		System.out.println("Main Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse of Array");
		for(int j=a.length-1; j>=0;j--) {
			System.out.print(a[j]+" ");
		}
	}

}
