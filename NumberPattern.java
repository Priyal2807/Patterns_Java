package practiceCN;
import java.util.*;
public class NumberPattern {
	public static void main(String[] args) {
		int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int row=0,i=0,j=0,space=2*n-2;
      while(row<n)
      {
        
        for(i=0;i<space;i++)
          System.out.print(" ");
        
        j=2*row+1;
        for(i=row+1;i<j;i++)
        {
          System.out.print(i);
        }
        
        if(i==j)
        {
          for(i=j;i>row;i--)
            System.out.print(i); 
        }
        
       space-=2;
        row++;
        System.out.println();
      }
	}

}
