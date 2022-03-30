class a {
    void methodA() {
        System.out.println("Base Class");
    }
}

class b extends a {
    void methodB() {
        System.out.println("Child Class");
    }
}

class single {
    public static void main(String[] args) {
        b b1 = new b();
        b1.methodA();
        b1.methodB();
    }
}