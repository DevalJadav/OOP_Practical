import java.util.*;

class first1 {
    String fname;
    void input1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Name");
        fname = sc.next();
    }
}

class second1 extends first1 {
    String lname;
    void input2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your Last name");
        lname = sc.next();
    }
    void display() {
        System.out.println("Your Name Is " +fname+ " " +lname);
    }
}

class personDemo {
    public static void main(String[] args) {
        second1 s1 = new second1();
        s1.input1();
        s1.input2();
        s1.display();
    }
}