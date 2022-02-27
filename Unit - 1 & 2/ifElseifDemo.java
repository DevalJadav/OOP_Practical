import java.util.*;
class ifElseifDemo {
    public static void main(String[] args) {
        int sub1,sub2,sub3;
        int total=0,per;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sub1 marks");
        sub1=sc.nextInt();

        System.out.println("Enter sub2 marks");
        sub2=sc.nextInt();

        System.out.println("Enter sub2 marks");
        sub3=sc.nextInt();
        total = sub1+sub2+sub3;
        per = total/3;
        System.out.println("Total = "+total+ "Per="+per);
        if (per>90) 
            System.out.println("Grade A");    
        else if(per>=70 && per<90) 
        
            System.out.println("Grade B");
        
        else if(per>=50 && per<70) 
        
            System.out.println("Grade C");
        
        else if(per>=40 && per<50)
        
            System.out.println("Grade D");
        
        else
        
            System.out.println("Fail");
        

    }
}
