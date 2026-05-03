package Oops;

class Method {
	
   public int add (int a,int  b) {
	   return a +b;
	   
   }
   
   public int add (int a , int b, int c) {
	   return a+b+c;
	   
   }
   public double  add (double a , double b) {
	   return a+b;
   }

}
   public class Methodoverloading{
	   
		public static void main(String[] args) {
			
			Method m = new Method ();
			System.out.println("2inputs : " + m.add(5, 6));
			System.out.println("2inputs : " + m.add(5.5, 6.5));
			System.out.println("3inputs : " + m.add(5, 6,7));
	   
   }

		

	}


