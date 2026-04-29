
public class StringBuffer {

	public static void main(String[] args) {
		java.lang.StringBuilder sb = new StringBuilder("Hey");
		sb.append("Hello");
		sb.append("!");
		sb.append("Learning");
		sb.append("Java");
		sb.delete(0, 12);
		sb.reverse();
		sb.toString();
		sb.insert(3, "Char");
		sb.delete(2, 3);
		int length = sb.length();
		  String result = sb.toString();
		
		System.out.println(result);
		System.out.println(length);
		System.out.println(sb);
		
		
		  StringBuilder sbs = new StringBuilder("Hello");
		  sbs.append(" World");

		  String results = sbs.toString();
		  System.out.println(results);          // Hello World
		  System.out.println(results.length());
		
		//same for String buffer but its a thread safe and synchronized .

	}

}
