package Oops;

  abstract class Animal {
      String name;

      Animal(String name) {
          this.name = name;
      }

      abstract void makeSound();

      void sleep() {
          System.out.println(name + " is sleeping");
      }
  }

  class Dog extends Animal {
      Dog(String name) {
          super(name);
      }

      @Override
      void makeSound() {
          System.out.println(name + " says Woof!");
      }
  }

  class Cat extends Animal {
      Cat(String name) {
          super(name);
      }

      @Override
      void makeSound() {
          System.out.println(name + " says Meow!");
      }
  }

  public class AbstractAnimal{
      public static void main(String[] args) {
          Animal a = new Cat("Tom");
          Animal a1 = new Dog("Rex");

          a.makeSound();
          a1.makeSound();

          a.sleep();
          a1.sleep();
         
      }
  }
