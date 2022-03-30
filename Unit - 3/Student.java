class Data {
    String name;
    int roll_no;

    public void display() {
        System.out.println("Name = " +name);
        System.out.println("Roll No = " +roll_no);
        }
}

class Student {
    public static void main(String[] args) {
        Data s1=new Data();
        s1.name = "John";
        s1.roll_no = 2;
        s1.display();
    }
}