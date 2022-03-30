class rectangle6 {
    float lenght, width;

    public void display() {
        System.out.println("Lenght = " +lenght);
        System.out.println("Width = " +width);
    }

    public void getSum() {
        float sum=lenght + width;
        System.out.println("Sum = " +sum);
    }

    public void getData(float l, float w) {
        lenght = l;
        width = w;
    }
}

class RecDemo6 {
    public static void main(String[] args) {
        rectangle6 r1=new rectangle6();
        r1.getData(10 , 20);
        r1.display();
        r1.getSum();


        rectangle6 r2=new rectangle6();
        r2.getData(50 , 100);
        r2.display();
        r2.getSum();
    }
}