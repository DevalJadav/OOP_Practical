class MethodOver1 {
    int a;
    String b;
    double c;

    void display(int a) {
        System.out.println("Integer = " +a);
    }

    void display(String b) {
        System.out.println("String = " +b);
    }

    void display(Double c) {
        System.out.println("Double = " +c);
    }
}

class MethodOverloading1 {
    public static void main(String[] args) {
        MethodOver1 m1 = new MethodOver1();    
        m1.display(20);
        m1.display("Deval");
        m1.display("10.5");
    }
}