import java.util.*;
class maximum {
    public static void main(String args[]) 
    {
        int a,b,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Value of A:");
        a=sc.nextInt();

        System.out.println("Enter Your Value of B:");
        b=sc.nextInt();

        if (a>b) 
        {
            max=a;    
        }
        else
        {
            max=b;
        }
        System.out.println("Maximum No. Is "+max);
    }
}