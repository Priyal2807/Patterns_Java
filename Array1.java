package practiceCN;

public class Array1 {
	public static int sum(int arr[])
	{
      int i=0,overall=0,sum2=0;
      for(i=0;i<arr.length;i++)
        overall+=arr[i];
      int mid=overall;
      
    while(true){
      while(overall!=0){
        sum2+=overall%10;
        overall=overall/10;
      }
        if(sum2/10!=0)
        {
          overall=sum2;
          sum2=0;
          continue;
        }
        
        else
          break;
      }
 
      return sum2;
          
	}

}
