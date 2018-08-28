package kool;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=1,n=0,col=0,val=0;
Scanner s = new Scanner(System.in);
n=s.nextInt();
while(row<=n)
{
	col=1;
	val=n-row+1;
	while(col<=row-1)
	{
		System.out.print(val);
		val++;
		col++;
	}
	while(col<=n)
	{
		
		System.out.print(n);
		col++;
	}
	
	System.out.println();
	row++;
}
	}

}
