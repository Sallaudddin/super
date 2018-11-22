
public class printA 
{
	 public static void main(String[] args) 
	 {
	        int r = 5, k = 0;

	        for(int i = 1; i <= r; i++, k = 0) 
	        {
	            for(int s = 1; s<=r - i; s++) 
	            {
	            	
	            		 System.out.print("  ");
	            	
	            }
                 int n=2*i-1;
	           
	            	if(n==1)
	            	{
	                System.out.println("* ");
	            	}
	            	else if(n==3)
	            	{
	            		 System.out.println("* "+"   "+"*");
	            	}
	            	else if(n==5)
	            	{
	            		 System.out.println("* "+"* "+"* "+"* "+"* ");
	            	}
	            	else if(n==7)
	            	{
	            		 System.out.println("*"+"           "+"*");
	            	}
	            	else if(n==9)
	            	{
	            		 System.out.println("*"+"               "+"*");
	            	}
	         	      
	         	            
	        }
	    }

}
