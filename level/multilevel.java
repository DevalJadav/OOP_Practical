class x {
    void methodx() {
        System.out.println("grand parent class");
    }
}

class y extends x {
    void methody() {
        System.out.println("parent class");

    }
}

    class z extends y {
        void methodz() {
            System.out.println("child class");

        }
    }

class Multileveldemo
{
 public static void main(String args[]) {
           z z1=new z();
           z1.methodx();
           z1.methody();
           z1.methodz();
       }
}