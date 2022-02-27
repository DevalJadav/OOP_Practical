class ArithmeticOP
{
	public static void main(String args[])
	{
		int a=20,b=10,sum,sub,mul,div,modu;
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		modu=a%b;
		System.out.println("Addition="+sum);
		System.out.println("Subtraction="+sub);
		System.out.println("Multiplication="+mul);
		System.out.println("Division="+div);
		System.out.println("Modul="+modu);
		//a++; 
		System.out.println("Post increment="+(a++));
		//++b;
		System.out.println("Pre increment="+(++b));
		System.out.println("Post Decrement="+(a--));
		System.out.println("Pre Decrement="+(--b));
		System.out.println("a="+a);
		
	}
}