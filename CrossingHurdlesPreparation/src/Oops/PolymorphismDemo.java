package Oops;

  class Polymorphism{
      public double calculatedArea() {
          return 0;
      }
  }

  class Circle extends Polymorphism {
      double radius;

      Circle(double radius) {
          this.radius = radius;
      }

      @Override
      public double calculatedArea() {
          return Math.PI * radius * radius;
      }
  }

  class Rectangle extends Polymorphism {
      double length, width;

      Rectangle(double length, double width) {
          this.length = length;
          this.width = width;
      }

      @Override
      public double calculatedArea() {
          return length * width;
      }
  }

  class Triangle extends Polymorphism {
      double base, height;

      Triangle(double base, double height) {
          this.base = base;
          this.height = height;
      }

      @Override
      public double calculatedArea() {
          return 0.5 * base * height;
      }
  }

  public class PolymorphismDemo {

      public static void main(String[] args) {
          Circle c = new Circle(5);
          Rectangle r = new Rectangle(4, 6);
          Triangle t = new Triangle(10, 5);

          System.out.println("Circle area: " + c.calculatedArea());
          System.out.println("Rectangle area: " + r.calculatedArea());
          System.out.println("Triangle area: " + t.calculatedArea());
      }
  }
