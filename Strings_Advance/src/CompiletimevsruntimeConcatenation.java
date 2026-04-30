
public class CompiletimevsruntimeConcatenation {

	public static void main(String[] args) {
		String s = "Java";
		String s1 = "Ja" + "va";//Compile time String pool
		final String s3 = "Ja";
	 String s4 = s3+"va"; //runtime Heap , as compiler doesn't know what holds in varaible s3
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s==s4);
		System.out.println(s.equals(s4));
		

	}

}
