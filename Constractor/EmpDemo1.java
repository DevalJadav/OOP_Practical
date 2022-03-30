import java.util.*;

class Emp1
{
    int no;
    String name, city;
    Emp1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your No. ");
        no = sc.nextInt();

        System.out.println("Enter Your Name ");
        name = sc.next();

        System.out.println("Enter Your City ");
        city = sc.next();
        sc.close();
    }

    void display() {
        System.out.println("No. = " +no);
        System.out.println("Name = " +name);
        System.out.println("City = " +city);
    }
}

class EmpDemo1 {
    public static void main(String args[]) {
        Emp1 e1 = new Emp1();
        e1.display();
    }
}