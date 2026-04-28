
public class Firstnonrepeating {

	public static void main(String[] args) {
		String s = "Swissbeauty";
		//algorithm

		  for (int i = 0; i < s.length(); i++) {     // outer: pick char
		      char ch = s.charAt(i);
		      int count = 0;

		      for (int j = 0; j < s.length(); j++) {  // inner: count it
		          if (s.charAt(j) == ch) {
		              count++;
		          }
		      }

		      if (count == 1) {                       // found!
		          System.out.println("First non-repeating: " + ch);
		          break;                              // stop searching
		      }
		  }
	}
}

