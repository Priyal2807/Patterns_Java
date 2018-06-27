package practiceCN;

public class DiamondNumber {
	

	public static void print(int n) {
      int row=1,col=1,i,j=1,space;
      while(row<=n)
      {
        j=1;
        space=n-row;
        if(row<=(n/2)+1){
        for(i=0;i<space;i++)
        {
          System.out.print(" ");
        }

        
        for(i=0;i<col;i++){
          System.out.print(j);
          j++;
        }
 
        col+=2;
          if(row==(n/2)+1)
            col-=2;
        }
        else if(row>(n/2)+1)
        {
          space-=row-((n/2)+1);
          for(i=0;i<space;i++)
            System.out.print(" ");
          
          col-=2;
            for(i=0;i<col;i++)
            {
              System.out.print(j);
              j++;
            }
        }
        row++;
        System.out.println();
        
      }
	

	}


}
