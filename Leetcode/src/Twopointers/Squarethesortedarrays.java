package Twopointers;

public class Squarethesortedarrays {

	public static void main(String[] args) {
	//Using two pointers 
		
	int [] nums = {-4,-1,0,3,10};
	// Using Two Pointers
	
	int n = nums.length;
	int left = 0;
	int right = n-1;
	int [] result = new int [n];
	int index = n-1;
	
	while (left <=right) {
		int leftsq = nums[left] * nums [left];
		int rightsq = nums [right] * nums[right];
		
		if (leftsq>rightsq) {
			result[index] = leftsq;
			left++;
			
		}
		else {
			result [index] = rightsq;
			right --;
		}
		index--;
	}
	System.out.println(result);
	
	
}

}
