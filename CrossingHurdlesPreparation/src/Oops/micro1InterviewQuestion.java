package Oops;

import java.lang.reflect.Array;

public class micro1InterviewQuestion {

	public static void main(String[] args) {
	int [] customerorder = {10,10,10,20,50};
	int [] customerorder1 = {10,10,20,40,50};
	
	int count10 = 0;
	int count20= 0;
	boolean cangivechange = true;
	
	for (int bill: customerorder) {
		if (bill==10) {
			count10++;
		}
		else if (bill==20){
			if (count10>=1) {
				count10--;
				count20++;
		}
		else {
			cangivechange = false;
			break;
			
		}
	}
		 else if (bill == 50) {
             if (count20 >= 1 && count10 >= 1) {
                 count20--;
                 count10--;
             }
             else if (count10 >= 3) {
                 count10 -= 3;
             } else {
            	 cangivechange = false;
                 break;
             }
         }
     }

     if (cangivechange) {
         System.out.println("Yes - Can serve all customers!");
     } else {
         System.out.println("No - Cannot give change!");


	}

	}
}
