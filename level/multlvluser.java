import java.util.Scanner;

class first {
    int a, b;

    void setdata_f(int i, int j) {
        a = i;
        b = j;
    }
}

class second extends first {
    int c;

    void setdata_s(int k) {
        c = k;
    }
}

class third extends second {
    int i,j,k;
    void getdata(){
        Scanner sc= new Scanner(System.in);
       System.out.println("enter value=");
       i= sc.nextInt();

       System.out.println("enter value=");
       j = sc.nextInt();

       System.out.println("enter value=");
       k = sc.nextInt();

       sc.close();

       setdata_f(i, j);
       setdata_s(k);
    }
    void display() {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    void addition() {
        int sum = a + b + c;
        System.out.println("answer=" + sum);
    }
}

class multvluser {
    public static void main(String[] args) {
        third t1 = new third();
        t1.getdata();
        t1.display();
        t1.addition();
    }
}