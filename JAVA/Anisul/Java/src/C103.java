public class C103 {

  // method with return and parameters

  static class Teacher {
    // properties
    String name;
    int age;
    double cgpa;

    // create a constructor
    /*
    properties:
    1. no need to call
    2. initialize inside the class
    3. same name as class name
    4. there is no return type
    5. it is a special type of method
     */

    Teacher(String name, int age, double cgpa) {
      this.name = name;
      this.age = age;
      this.cgpa = cgpa;
    }

    // create a method
    void displayInfo() {
      System.out.println("Name : " + name);
      System.out.println("Age : " + age);
      System.out.println("CGPA : " + cgpa);
      System.out.println();
    }
  }

  public static void main(String[] args) {

    // create object with constructor
    Teacher teacher1 = new Teacher("Prince", 25, 3.16);

    System.out.println("\nTeacher 1 details:");
    teacher1.displayInfo();

    // create object
    Teacher teacher2 = new Teacher("Princess", 19, 3.93);

    System.out.println("Teacher 2 details:");
    teacher2.displayInfo();
  }
}

/*
def: Constructor is a special type of method that is used
to initialized the object

properties:
1. Constructor has the same name as that of the class it belongs
2. it has no return type not even void
3. it a special type of method
4. it is called automatically
5. default constructor(no parameter), parametrized constructor


 */
