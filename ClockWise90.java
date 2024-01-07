package Array;

import java.util.Scanner;

public class ClockWise90 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("rows");
		int row=sc.nextInt();
		System.out.println("Coloumn");
		int col=sc.nextInt();
		
		int[][] a=new int [row][col];
		
		System.out.println("Element of matrix");
		
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Normal matrix");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
			System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
		
		System.out.println("Transpose of matrix");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}

}
