class C {
    int a,b;
    void getData(int x, int y) {
        a = x;
        b = y;
    }
}

class D extends C {
    void addition() {
        System.out.println("A + B = " +(a+b));
    }
}

class addition {
    public static void main(String[] args) {
        D d1 = new D();
        d1.getData(100, 50);
        d1.addition();
    }
}