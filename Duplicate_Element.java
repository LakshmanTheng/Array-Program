package array;

// Duplicate element in single array

public class Duplicate_Element {

	public static void main(String[] args) {
		int[] a= {1,2,4,1,5,2,6,4};
		int count=0;
		for(int i=0;i<a.length; i++) {
			count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]+" ");
					
				}
				count++;
			}
			
		}
		System.out.println(count);
	}

}
