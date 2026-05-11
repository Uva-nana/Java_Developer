package Twopointers;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		char [] s = {'h','e','l','l','o'};
		// How will You reverse this 
		int left = 0;
		int right = s.length-1;
		
	
	while (left <right) {
		char temp = s[left];
		s[left] = s[right];
		s[right] = temp;
		
		left++;
		right--;
		
		
	}
		
	System.out.println(Arrays.toString(s));
	System.out.println(s);
		 
		
		
	}

}