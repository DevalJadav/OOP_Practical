class A1{
    int a, b, c;
    A1()
    {
        a=b=c=10;
    }

    void display()
    {
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
    }
}

class A1Demo {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.display();
    }
}