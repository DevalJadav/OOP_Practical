import java.util.*;

class emp {
    int no;
    String name, city;

    void getData(int N, String n, String c) {
        no = N;
        name = n;
        city = c;
    }
    
    emp() {
        //Using user input
        int N;
        String n, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your No. : ");
        N = sc.nextInt();

        System.out.println("Enter Your Name : ");
        n = sc.next();

        System.out.println("Enter Your City : ");
        c = sc.next();
        sc.close();
        getData(N, n, c);
    }

    void display() {
        System.out.println("No. : " +no);
        System.out.println("Name : " +name);
        System.out.println("City : " +city);
    }
}

class empDemo {
    public static void main(String[] args) {
        emp e1 = new emp();
        e1.display();
    }
}