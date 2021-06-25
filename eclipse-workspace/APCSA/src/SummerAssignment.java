
public class SummerAssignment {

	public static void longestStreak(String str){

	       char prevLetter = '_'; 
	       /*prevLetter is used to prevent the error.
	       By comparing '_' with each letter if the string, we can check whether it is letter or not
	       This char variable is changing over the code.*/
	       String largestStreak = "";
	       //Just a empty String.
	       String text = "";
	       //Just a empty string
	       for (int i = 0; i < str.length(); i++) {
	    	   //This for statement iterates n times, where n is the length of the String that you put.
	           char c = str.charAt(i);
	           //This initialization changes the str that you put to char type by indexing str.
	           if (c != prevLetter){
	               text = "";
	           }
	           //This If statement compares prevLetter with C which is each letter of str and if they are not identical it just return text with empty string (just checking whether it is string).
	           text += c;
	           if (text.length() > largestStreak.length()) {
	                   largestStreak = text;
	           }
	           prevLetter = c;
	       }
	       if (largestStreak.length() == 1) {
	    	   System.out.println("there is no streak");
	       } else {
	    	   System.out.println(largestStreak.charAt(0) + " " + largestStreak.length());
	       }
	   }
	      
	   public static void main(String[] args) {
	       longestStreak("abcde");
	   }
}
