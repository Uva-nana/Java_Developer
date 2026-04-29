
 public class MutableDisaster {
      public static void main(String[] args) {
          StringBuilder st = new StringBuilder("Hello");
          StringBuilder sa = st;        // sa points to SAME object as st
          StringBuilder sg = st;        // sg points to SAME object as st

          System.out.println(st);  // Hello
          System.out.println(sa);  // Hello
          System.out.println(sg);  // Hello

          st.append(" Bye");       // ← MODIFICATION (not reassignment!)

          System.out.println(st);  // Hello Bye
          System.out.println(sa);  // Hello Bye 😱  (you didn't change sa!)
          System.out.println(sg);  // Hello Bye 😱  (you didn't change sg!)
      }
  }
