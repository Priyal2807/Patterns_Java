package practiceCN;
class ListNode<t> {
	public t data;
	public ListNode<t> next;
	public ListNode(t data)
	{
		this.data=data;
	}
}

public class HalfAddAndReverse {
	  public static int length(ListNode<Integer> head)
	  {
	    int count=0;
	    ListNode<Integer> temp=head;
	    while(temp!=null)
	    {
	      count++;
	      temp=temp.next;
	    }
	    
	    return count;
	  }
	  
	  public static int HalfAddRev(ListNode<Integer> head) {
	      int len=length(head);
	      int mid=0;
	      if(len%2!=0)
	        mid=(len/2)+1;
	      else
	        mid=len/2;
	      
	      int i=1;
	      int product=0,product1=0;
	      ListNode<Integer> temp=head;
	      while(i!=mid+1){
	    
	        product+=(int)(temp.data*Math.pow(10,mid-i));
	        
	        temp=temp.next;
	        i++;
	        
	      }
	      int rem=len-mid;
	      int diff=i-rem;
	      while(i!=len+1){
	        product1+=temp.data*Math.pow(10,i-diff-rem);
	        temp=temp.next;
	        i++;
	      }
	      
	      return product+product1;
			
		
		}
		public static int HalfAdd(ListNode<Integer> head) {
		      int len=length(head);
		      int mid=0;
		      if(len%2!=0)
		        mid=(len/2)+1;
		      else
		        mid=len/2;
		      
		      int i=1;
		      int product=0,product1=0;
		      ListNode<Integer> temp=head;
		      while(i!=mid+1){
		    
		        product+=(int)(temp.data*Math.pow(10,mid-i));
		        
		        temp=temp.next;
		        i++;
		        
		      }
		      
		      while(i!=len+1){
		        product1+=temp.data*Math.pow(10,len-i);
		        temp=temp.next;
		        i++;
		      }
		      
		      return product+product1;
				
			
			}
	  

}
