import java.util.*;

class Area {
    int length, width;
    void input1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Lenght");
        length = sc.nextInt();
        
        System.out.println("Enter Your Width");
        width = sc.nextInt();
    }
}

class Volume extends Area{
    int height;

    void input2() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Height");
        height = sc.nextInt();

        sc.close();
    }

    void show() {
        System.out.println("Lenght = " +length);
        System.out.println("Width = " +width);
        System.out.println("Height = " +height);
        System.out.println("----------------------------------------");
        System.out.println("Volume = " +(length * width * height));
    }
}




class AreaDemo {
    public static void main(String[] args) {
        Volume v1 = new Volume();
        v1.input1();
        v1.input2();
        v1.show();
    }   
}
