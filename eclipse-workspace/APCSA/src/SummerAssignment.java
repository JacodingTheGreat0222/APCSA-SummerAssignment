
public class SummerAssignment {

	public static void longestStreak(String str){

	       char prevLetter = '_';
	       String largestStreak = "";
	       String text = "";

	       for (int i = 0; i < str.length(); i++) {
	           char c = str.charAt(i);
	           if (c != prevLetter){
	               text = "";
	           }
	           text += c;
	           if (text.length() > largestStreak.length()) {
	                   largestStreak = text;
	           }
	           prevLetter = c;
	       }
	       System.out.println(largestStreak.charAt(0) + " " + largestStreak.length());
	   }

	   public static void main(String[] args) {
	       longestStreak("ddddddddduuuduuuduuudasasxs");
	   }
}
