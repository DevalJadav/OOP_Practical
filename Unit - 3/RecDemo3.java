class rectangle {
    float lenght, width;    
}

class RecDemo3 {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.lenght = 34.5f;
        r1.width = 78.4f;
        System.out.println("Length = " +r1.lenght);
        System.out.println("Width = " +r1.width);


        rectangle r2=new rectangle();
        r2.lenght = 50.0f;
        r2.width = 100.0f;
        System.out.println("Length = " +r2.lenght);
        System.out.println("Width = " +r2.width);

        float sumlength = r1.lenght + r2.lenght;
        System.out.println("Sum Of Length = " +sumlength);

        float sumwidth = r1.width + r2.width;
        System.out.println("Sum Of Width = " +sumwidth);
    }
}