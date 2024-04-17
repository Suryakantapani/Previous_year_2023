package second_Semester;

public class previous_year {
    public static void main(String[] args) {
        /*
        //Q1
        //a
        Output:
        -55
        -176
        -110 -110

        //b
        Ooh...

        //c


        //Q2
        //a
        class Complex{
            double real;
            double imag;
            void setData(double real, double imag){
                this.real=real;
                this.imag=imag;
            }
            void display(){
                System.out.println(real+" + "+imag+"i");
            }
            public Complex add(Complex c1, Complex c2){
                Complex c=new Complex();
                c.real= c1.real + c2.real;
                c.imag= c1.imag + c2.imag;
                return c;
            }
        }
        public class q2a {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                double r,i;
                Complex c1= new Complex();
                System.out.println("Enter real and imaginary part of first number: ");
                r= sc.nextDouble();
                i= sc.nextDouble();
                c1.setData(r,i);
                System.out.println("First complex no: ");
                c1.display();

                Complex c2= new Complex();
                System.out.println("Enter real and imaginary part of second number: ");
                r= sc.nextDouble();
                i= sc.nextDouble();
                c2.setData(r,i);
                System.out.println("Second complex no: ");
                c2.display();

                Complex sum= new Complex();
                sum=sum.add(c1,c2);
                System.out.println("Sum of the two complex numbers is: ");
                sum.display();
            }
        }

        //b
        class Person{
            String name;
            int age;
            Person(String name, int age){
                this.name=name;
                this.age=age;
            }
            void displayStudent(){
                System.out.println("Name "+name);
                System.out.println("Age "+age);
            }
        }
        class Employee extends Person{
            int eid;
            int dept;
            double salary;
            Employee(String name, int age, int eid, int dept, double salary){
                super(name,age);
                this.eid=eid;
                this.dept=dept;
                this.salary=salary;
            }
            void displayDetails(){
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);
                System.out.println("Employee id: "+eid);
                System.out.println("Dept: "+dept);
                System.out.println("Salary: "+salary);
            }
        }

        //c
        public class q2c {
            public static void main(String[] args) {
                Employee emp[]=new Employee[50];
                for (int i=0; i<50; i++){
                    emp[i]=new Employee("Employee"+(i+1),25,i+2000,"Department"+(i%5),i*1000);
                }
                for (int i=0; i<50; i++){
                    emp[i].displayDetails();
                    System.out.println();
                }
            }
        }

        //Q3
        //a
        public interface StaffInterface {
            void displayStaff();
            void giveBonus(double amount);
        }
        public abstract class Staff {
            private String firstName;
            private String lastName;
            private double salary;

            public Staff(String firstName, String lastName, double salary) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.salary = salary;
            }
            public abstract void displayStaff();
        }

        //b
        public class Supervisor extends Staff implements StaffInterface {
            private double bonus;

            public Supervisor(String firstName, String lastName, double salary, double bonus) {
                super(firstName, lastName, salary);
                if (bonus <= 0) {
                    throw new IllegalArgumentException("Bonus amount should be greater than zero.");
                }
                this.bonus = bonus;
            }

            public void displayStaff() {
                System.out.println("Supervisor: " + getFirstName() + " " + getLastName() + ", Salary: " + getSalary() + ", Bonus: " + bonus);
            }

            public void giveBonus(double amount) {
                if (amount <= 0) {
                    throw new IllegalArgumentException("Bonus amount should be greater than zero.");
                }
                bonus += amount;
            }
        }
        public class Main {
            public static void main(String[] args) {
                try {
                    Supervisor supervisor1 = new Supervisor("xyz", "abc", 50000, 5000);
                    Supervisor supervisor2 = new Supervisor("pwr", "xyz", 60000, 6000);
                    StaffInterface[] staffArray = new StaffInterface[]{supervisor1, supervisor2};
                    for (StaffInterface staff : staffArray) {
                        staff.displayStaff();
                    }
                }
                catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        //c
        public class Main {
            public static void main(String[] args) {
                String[] animals = {"Dog", "Cat", "Lion", "Tiger"};

                try {
                    System.out.println(animals[4]);

                    int num = Integer.parseInt("elephant");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Index is out of bounds.");
                } catch (NumberFormatException e) {
                    System.out.println("Error: Cannot convert string to integer.");
                }
            }
        }


        //Q4
        //a
        Java does not support multiple inheritance, meaning a class cannot directly inherit from more than one class. This decision was made to simplify the language and avoid certain complexities and ambiguities that arise with multiple inheritance.
                One of the main reasons for not supporting multiple inheritance is the "diamond problem." Consider the following scenario:
        class A {
            void foo() {
                System.out.println("A");
            }
        }

        class B extends A {
            void foo() {
                System.out.println("B");
            }
        }

        class C extends A {
            void foo() {
                System.out.println("C");
            }
        }

        class D extends B, C {
            // Error
        }
        In this example, if class D were allowed to inherit from both B and C, and both B and C inherit from A, then calling foo() on an instance of D would lead to ambiguity. Which foo() method should be called, the one from B or the one from C?

        //b
        public class Main {
            public static void main(String[] args) {
                Integer[] intArray = {1, 2, 3, 4, 5};
                Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
                Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

                System.out.println("Printing Integer Array:");
                printArray(intArray);

                System.out.println("\nPrinting Double Array:");
                printArray(doubleArray);

                System.out.println("\nPrinting Character Array:");
                printArray(charArray);
            }

            public static <T> void printArray(T[] a) {
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }


        //Q5
        //a
        class MarkException extends Exception {
            public MarkException(String message) {
                super(message);
            }
        }

        public class Main {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);

                try {
                    System.out.print("Enter DSA mark: ");
                    int dsaMark = sc.nextInt();

                    if (dsaMark > 100) {
                        throw new MarkException("Mark can't be greater than 100");
                    }

                    System.out.println("DSA Mark: " + dsaMark);
                } catch (MarkException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        //b
        The finally block in java is used to put important codes such as clean up code e.g. closing the file or closing the connection. The finally block executes whether exception rise or not and whether exception handled or not. A finally contains all the crucial statements regardless of the exception occurs or not.

         */



    }
}
