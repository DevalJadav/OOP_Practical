class emp {
    int id;
    String name, city;

    public void display() {
        System.out.println("Id = " +id);
        System.out.println("Name = " +name);
        System.out.println("City = " +city);
    }
    
    public void getData(int i, String n, String c) {
        id = i;
        name = n;
        city = c;
    }
}



class employee {
    public static void main(String[] args) {
        emp e1=new emp();
        e1.getData(10 , "Harsh", "Ahmedabad");
        e1.display();

        emp e2=new emp();
        e2.getData(15 , "John", "Vadodara");
        e2.display();
    }
}
