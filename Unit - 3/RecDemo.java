class rectangle {
    float lenght, width;    
}

class RecDemo {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.lenght = 34.5f;
        r1.width = 78.4f;
        System.out.println("Length = " +r1.lenght);
        System.out.println("Width = " +r1.width);
    }
}