 package Oops;

  class Employee {
      String name;
      double salary;

      public Employee(String name, double salary) {
          this.name = name;
          this.salary = salary;
      }

      void displayInfo() {
          System.out.println("Name: " + name + ", Salary: " + salary);
      }
  }

  class Manager extends Employee {
      double bonus;

      public Manager(String name, double salary, double bonus) {
          super(name, salary);
          this.bonus = bonus;
      }

      @Override
      void displayInfo() {
          super.displayInfo();
          System.out.println("Bonus: " + bonus);
      }
  }

  public class InheritanceDemo {

      public static void main(String[] args) {

          Manager m = new Manager("Yuva", 500000, 5000);
          m.displayInfo();

          System.out.println("---");

          Employee e = new Employee("Mary", 40000);
          e.displayInfo();
      }
  }