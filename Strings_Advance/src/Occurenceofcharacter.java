
public class Occurenceofcharacter {
	public static void main (String [] args) {
		
String s = "Programming";
char target = 'm';
int count =0;

for (int i =0; i<s.length(); i++) 
{
	
	if(s.charAt(i)==target) {
		count++;
	}
}
System.out.println("Character " + target + " appears " + count + " times");
}
}