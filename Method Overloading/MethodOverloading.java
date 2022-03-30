class MethodOver {
    int a, b, c, sum = 0;
    void addition(int x) {
        a = x;
        sum = a + 10;
        System.out.println("Sum = " +sum);
    }

    void addition(int x, int y) {
        a = x;
        b = y;
        sum = a + b;
        System.out.println("Sum = " +sum);
    }

    void addition(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
        sum = a + b + c;
        System.out.println("Sum = " +sum);
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        MethodOver m1 = new MethodOver();    
        m1.addition(20, 30);
        m1.addition(50, 100, 150);
        m1.addition(200);
    }
}