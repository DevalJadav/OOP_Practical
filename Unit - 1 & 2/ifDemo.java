import java.util.*;
class ifDemo {
    public static void main(String[] args) 
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        age=sc.nextInt();
        
        if(age>=18)
        {
            System.out.println("You are Giving Vote");
        }
    }
}