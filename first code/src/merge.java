import java.util.*;

	public class merge{
		public static String merg(String s1,String s2) {
			if (s1.length()==0&&s2.length()==0) return "";
			else if (s1.length()==0) return s2;
			else if (s2.length()==0) return s1;
			else if  (s1.charAt(0)<s2.charAt(0))
				return s1.charAt(0)+merg(s1.substring(1),s2);
			else 
				return s2.charAt(0)+merg(s1,s2.substring(1));
		}
		 public static void main(String[] args) {
	     System.out.println(merg("ABC","DEF"));
	     System.out.println(merg("ACE","BDF")); 
			 }}

