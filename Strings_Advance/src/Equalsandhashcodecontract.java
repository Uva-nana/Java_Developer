
public class Equalsandhashcodecontract {

	public static void main(String[] args) {
		  String s = "Hello";
          String s1 = "Hello";
          String s2 = "Hello World";

          System.out.println("s equals s1: " + s.equals(s1));
          System.out.println("s equals s2: " + s.equals(s2));

          System.out.println("s hashCode: " + s.hashCode());
          System.out.println("s1 hashCode: " + s1.hashCode());
          System.out.println("s2 hashCode: " + s2.hashCode());

          System.out.println("\n--- Contract Check ---");
          System.out.println("Equal objects same hashCode? " +
                             (s.equals(s1) && s.hashCode() == s1.hashCode()));
          System.out.println("Different objects different hashCode? " +
                             (s.hashCode() != s2.hashCode()));

	}

}
