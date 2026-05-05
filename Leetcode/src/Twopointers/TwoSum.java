package Twopointers;

import java.util.ArrayList;
import java.util.Arrays;

/* Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space. */

public class TwoSum {

	public static void main(String[] args) {
		int [] numbers = {2,7,11,15};
		int target = 9;
		int left = 0;
		int right = numbers.length-1;
		ArrayList <Integer> arr = new ArrayList <>();
		int [] result = new int [2];
		
		
		while (left<right) {
			int sum = numbers[left] +numbers [right];
			if (sum==target) {
			arr.add(left+1);
			arr.add(right+1);
			result[0] = arr.get(0);
			result [1] = arr.get(1);
			System.out.println(Arrays.toString(result));   // ✅ PRINT!
			return;
           
			
			}
			else if (sum<target) {
				left++;
			}
			else {
				right--;
			}
		 
		}
		 System.out.println("No solution found");
    }

	}


