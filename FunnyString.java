package StringAssessement;

import java.util.Scanner;

public class FunnyString {
	
	 static String funnyString(String s){
		 StringBuffer sb = new StringBuffer(s);
		   sb = sb.reverse();
	 
		   boolean b = true;
		   for(int i=1; i<s.length(); i++){
			   if(Math.abs(s.charAt(i)-s.charAt(i-1)) != Math.abs(sb.charAt(i)-sb.charAt(i-1))){
				   b = false; break;}
		   }
		   if(b == true) return "Funny";
		   else return "Not Funny";
		   
			   }

	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int q = in.nextInt();
		        for(int a0 = 0; a0 < q; a0++){
		            String s = in.next();
		            String result = funnyString(s);
		            System.out.println(result);
		    }

	}

}
