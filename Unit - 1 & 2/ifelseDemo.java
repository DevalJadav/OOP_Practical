import java.util.*;
class ifelseDemo {
    public static void main(String[] args) 
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        age=sc.nextInt();
        
        if(age>=18)
        {
            System.out.println("You are Eligible for Vote");
        }
        else
        {
            System.out.println("Age is below 18 so... not Eligible");
        }
    }
}