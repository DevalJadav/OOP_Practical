package demo;
class A {
    void methodA() {
        System.out.println("Class A method");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Class B method");
    }
}

class C extends A {
    void methodC() {
        System.out.println("Class C method");
    }
}

class D extends A {
    void methodD() {
        System.out.println("Class D method");
    }
}

class hierachicalDemo {
    public static void main(String[] args) {
        B b1 = new B();
        C c1 = new C();
        D d1 = new D();

        b1.methodA();
        c1.methodA();
        d1.methodA();
        c1.methodC();
    }
}
