class ArithOp {
    public static void main(String args[]) 
	{
        int a=50,b=10,sum,mul,sub,div,modu;
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
	  modu=a%b;

        System.out.println("Addition = "+sum);
        System.out.println("Sustraction = "+sub);
        System.out.println("Multiplication = "+mul);
        System.out.println("Division = "+div);
	  System.out.println("Division = "+modu);
	  a++;
	  System.out.println("Post Increment="+a);
	  ++b;
	  System.out.println("Pre Increment="+b);
    }
}
