package kool;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=2, col=0 ;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.print(1);
		System.out.println();
		while(row<=n)
		{ 
		  col=2;
		  System.out.print(row-1);
		   while(col<=row-1)
		   {
			   System.out.print(0);
			   col++;
			   
		   }
		   System.out.print(row-1);
		   System.out.println();
		   row++;
			}

	}

}
