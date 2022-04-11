

	import java.util.Scanner;

	public class contains{
		public static  boolean contains (char c,String s){
			for (int i=0;i<s.length();i++) {
				if (c==s.charAt(i))
					return true;
				
			}
			return false ;
				
			}

		
		 public static void main(String[] args) {
	    
	     System .out.println(contains('z',"hello world"));
	     
			 }}

