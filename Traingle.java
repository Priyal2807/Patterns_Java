package practiceCN;
import java.util.*;
public class Traingle {
	public static void main(String[] args) {
		  int ts,cs,i,j,row=1,col=1;
	      int n=0;
	      Scanner s=new Scanner(System.in);
	      n=s.nextInt();
	      if(n%2==0)
	      ts=2*n-4;
	      else
	        ts=n-1;
	      cs=ts;
	      while(row<=n)
	      {
	        
	        for(i=0;i<ts;i++)
	          System.out.print(" ");
	        ts--;
	        if(row==1)
	          System.out.print('1');
	        
	        else{
	          int val=row;
	          for(j=0;j<row-1;j++){
	            System.out.print(val);
	            val++;
	            if(val==2*row+1)
	            {
	              //stem.out.print(val);
	              val--;
	              break;
	            }
	          }
	          
	          while(val!=row-1){
	            System.out.print(val);
	            val--;
	          }

	          
	          
	        }
	        
	        System.out.println();
	        row++;
	        
	      }
	      
	      
		}

}
