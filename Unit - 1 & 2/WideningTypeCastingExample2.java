class WideningTypeCastingExample2
{
	public static void main(String[] args)
	{
		short a=50;
		int b=a;
		int x=7;
		long y = x;
		float z = y;
		System.out.println("Before conversation, int value "+x);
		System.out.println("After conversation, long value "+y);
		System.out.println("After conversation, float value "+z);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}