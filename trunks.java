package vuthanhtruong;

import java.util.Scanner;

public class trunksvu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Moi ban nhap canh hinh vuong");
		int n=new Scanner(System.in).nextInt();
		int M[][]=new int[n][n];
		int h1=0;
		int h2=n-1;
		int c1=0;
		int c2=n-1;
		int count=0;
		while(c1<=c2 && h1<=h2) {
			for(int i=h1;i<=h2;i++) {
				M[i][c1]=count;
				count++;
			}
			c1++;
			for(int i=c1;i<=c2;i++) {
				M[h2][i]=count;
				count++;
			}
			h2--;
			for(int i=h2;i>=h1;i--) {
				M[i][c2]=count;
				count++;
			}
			c2--;
			for(int i=c2;i>=c1;i--) {
				M[h1][i]=count;
				count++;
			}
			h1++;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}

	}

}
