package demo;
class A1 {
    int a, b;

    A1(int x, int y) {
        a = x;
        b = y;
    }
}

class B1 extends A1 {
    int c, d;

    B1(int p, int q,int r, int s) {
        super(p, q);
        c = r;
        d = s;
    }

    void display() {
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
    }

}

class SuperDemo {
    public static void main(String[] args) {
        B1 b1 = new B1(10, 20, 30, 40);
        b1.display();
    }
}