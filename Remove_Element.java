package array;

//Remove specific elements by position in Array

import java.util.Scanner;

public class Remove_Element {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int b=4;
		
		for (int i = b-1; i < a.length-1; i++) {
			
			a[i]=a[i+1];	
		}
		System.out.println("Remove specific element by position");
		for (int i = 0; i < a.length-1; i++) {
			System.out.println(a[i]);
			
		}
		

	}

}
 