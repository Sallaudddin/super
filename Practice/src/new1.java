
public class  new1
{

	
		public static void main(String args[]){  
		String s1="TC-01 TC-02 TC-03";  
	
		for(String w:s1.split("//s",0)){  
		System.out.println(w);  
		}  
		System.out.println("------------------------------------1"); 
	 
		for(String w:s1.split("\\s",1)){  
			System.out.println(w);  
		}  
		System.out.println("------------------------------------2"); 
		
		for(String w:s1.split("\\s",4)){  
			System.out.println(w);  
		}  
		System.out.println("------------------------------------3"); 
		  
		String s11="hello string   ";  
		System.out.println(s11+"javatpoint");//without trim()  
		System.out.println(s11.trim()+"javatpoint");//with trim() 
		}
}
