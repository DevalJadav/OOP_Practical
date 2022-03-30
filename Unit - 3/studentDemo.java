import java.util.*;

class student {
    int roll_no;
    String name, city;

    void getData(int r, String n, String c) {
        roll_no = r;
        name = n;
        city = c;
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("City: " + city);
    }

    void setData() {
        int n;
        String nam, cit;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = inp.nextInt();
        System.out.print("Enter Name: ");
        nam = inp.next();
        System.out.print("Enter City: ");
        cit = inp.next();
        inp.close();
        getData(n, nam, cit);

    }
}

class studentDemo {
     public static void main(String[] args) {
         student s1 = new student();
         s1.setData();
         s1.display(); 
    }
}