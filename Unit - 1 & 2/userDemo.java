import java.util.*;
class UserDemo {
    public static void main(String[] args) 
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Value:");
        a=sc.nextInt();
        
        if(a>0)
        {
            System.out.println(a+" is positive number");
        }
        else
        {   
            System.out.println(a+" is negative number");
        }
    }
}