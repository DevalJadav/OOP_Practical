class rectangle5 {
    float lenght, width;

    public void display() {
        System.out.println("Lenght = " +lenght);
        System.out.println("Width = " +width);
    }

    public void getSum() {
        float sum=lenght + width;
        System.out.println("Sum = " +sum);
    }
}

class RecDemo5 {
    public static void main(String[] args) {
        rectangle5 r1=new rectangle5();
        r1.lenght = 34.5f;
        r1.width = 78.4f;
        r1.display();
        r1.getSum();


        rectangle5 r2=new rectangle5();
        r2.lenght = 50.0f;
        r2.width = 100.0f;
        r2.display();
        r2.getSum();
    }
}