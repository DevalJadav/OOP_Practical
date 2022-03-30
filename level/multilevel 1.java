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

class Multileveldemo {
    public static void main(String[] args) {
        third t1 = new third();
        t1.setdata_f(100, 50);
        t1.setdata_s(20);
        t1.display();
        t1.addition();
    }
}