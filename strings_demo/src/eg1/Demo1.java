package eg1;

import java.util.Arrays;

public class Demo1 {
  public static void main(String[] args) {
	
	  String s1="hello";
	  System.out.println("s1 = " + s1);
	  System.out.println("s1.toUpperCase() ="  + s1.toUpperCase());
	  System.out.println("s1 = " + s1);
	  s1 = s1.toUpperCase();
	  System.out.println("s1 = " + s1);
	  
	  System.out.println("s1.length() = " + s1.length());
	  System.out.println("s1.charAt(0) =  " + s1.charAt(0) );
	  
	  System.out.println("s1.equals(\"HELLO) : " + s1.equals("HELLO"));
	  System.out.println("s1.equals(\"HELLO) : " + s1.equals("HeLLO"));
	  
	  System.out.println("s1.equals(\"HELLO) : " + s1.equalsIgnoreCase("HELLO"));
	  System.out.println("s1.equals(\"HELLO) : " + s1.equalsIgnoreCase("HeLLO"));
	  
	  System.out.println(s1.contains("L"));
	  System.out.println(s1.contains("LL"));
	  System.out.println(s1.contains("LOL"));

	 char c[] = s1.toCharArray();
	 System.out.println(Arrays.toString(c));
	 
	 System.out.println(s1.substring(2));
	 System.out.println(s1.substring(2, 4));
	 
	 System.out.println(s1.toLowerCase());
	 
	 String s2 = "Hello hi good afternoon and it's time for lunch";
	 
	 String ar[] = s2.split(" ");
	 for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
   
	 String s3 = "           heyyy         ";
	 System.out.println(s3);
	 System.out.println(s3.trim());
	 
	 System.out.println(s2.replace(" ", "-"));
  }
}
