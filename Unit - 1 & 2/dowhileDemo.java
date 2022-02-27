import java.util.*;

class dowhileDemo {
    public static void main(String[] args) {
        int sum=0, i;
        char ch;

        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter No");
            i=sc.nextInt();
            sum=sum+i;

            System.out.println("Enter Y for yes and N for no");
            ch=sc.next().charAt(0);
        } while (ch=='y' || ch=='Y');

        System.out.println("Sum Of No ==> "+sum);
    }
}