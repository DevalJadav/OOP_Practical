class A2{
    int a, b, c;
    A2()
    {
        a=b=c=10;
    }

    A2(int x) {
        a = x;
        b = x;
        c = x;
    }

    A2 (int x, int y) {
        a = x;
        b = y;
        c = 10;
    }

    A2 (int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void display()
    {
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
    }
}

class A2Demo {
    public static void main(String[] args) {
        A2 a1 = new A2();
        A2 a2 = new A2(50);
        A2 a3 = new A2(30, 40);
        A2 a4 = new A2(30, 40, 50);
        a1.display();
        a2.display();
        a3.display();
        a4.display();
    }
}