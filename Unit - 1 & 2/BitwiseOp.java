class BitwiseOp
{
	public static void main(String args[])
	{
		int a=4, b=5;
		int c;

        c=a & b;
        System.out.println(" & -->"+c);
        c=a|b;
        System.out.println(" | -->"+c);
        c=a ^ b;
        System.out.println(" ^ -->"+c);
        c=~a;
        System.out.println(" ~ -->"+c);
        c= a << b;
        System.out.println("<< -->"+c);
        c = a >> b;
        System.out.println(">> -->"+c);
	}
}