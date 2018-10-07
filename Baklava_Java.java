
public class Baklava_Java {

	public static void print(int n) {
	      int row=1,col=1,i,j=1,space,k=0,m;
	      if(n%2==0)
	    	  m=n+1;
	      else
	    	  m=n;
	      while(row<=m)
	      {
	        j=1;
	        space=n-row;
	        if(row<=(n/2)+1){
	        for(i=0;i<space;i++)
	        	System.out.print(" ");
	  
	        for(i=0;i<col;i++){
	        	System.out.print("*");
	          
	        }
	        k=0;
	        col+=2;
	          if(row==(n/2)+1) {
	        	  k=(n/2)+1;
	        	  col-=2;
	          }
	        }
	        
	        
	        else if(row>(n/2)+1)
	        {
	          space=n-k;
	          for(i=0;i<space;i++)
	            System.out.print(" ");
	          
	          col-=2;
	            for(i=0;i<col;i++)
	            {
	              System.out.print("*");
	              
	            }
	        }
	        row++;
	        k--;
	        System.out.println();
	      }
	        
}
	   
	      
	  	public static void main(String[] args) {
			
			print(21);
		}
}
