package Oops;
class Methods {
      public int add(int a, int b) {
          return a + b;
      }

      public void display() {
          System.out.println("This is parent class");
      }
  }

  class ChildMethods extends Methods {

      @Override
      public int add(int a, int b) {
          System.out.println("Child class adding...");
          return a + b + 100;          // adds 100 extra!
      }

      @Override
      public void display() {
          System.out.println("This is CHILD class");
      }
  }

  public class Methodoverriding {

      public static void main(String[] args) {

          Methods m = new Methods();
          System.out.println("Parent add: " + m.add(5, 10));
          m.display();

          System.out.println("---");

          ChildMethods c = new ChildMethods();
          System.out.println("Child add: " + c.add(5, 10));
          c.display();
      }
  }
