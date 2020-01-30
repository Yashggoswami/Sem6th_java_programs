import java.util.ArrayList;
import java.util.Scanner;

public class Employee1 {
    ArrayList arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Employee1 obj = new Employee1();
        obj.enterDetails();
        obj.display();
    }

    void enterDetails() {
        System.out.println("Enter employee details \n 1. Name");
        arr.add(sc.nextLine());
        System.out.println("2. Id");
        arr.add(sc.nextInt());
        System.out.println("3. Salary");
        arr.add(sc.nextInt());
    }

    void display() {
        System.out.println("Name - " + arr.get(0) + "\nId - " + arr.get(1) + "\nSalary - " + arr.get(2));
    }

}
