
public class RemoveDuplicateFromaString {

	public static void main(String[] args) {
		String s = "Programming";
		String result = "";
		//algorithm
		
		for (int i =0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(!result.contains(String.valueOf(ch))) 
			{
				result = result+ch;
			}
		
	}
  System.out.println("After removing the duplicates :" + result);
}
}