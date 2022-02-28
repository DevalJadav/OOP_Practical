public class WideningTypeCastingExample
{
	public static void main(String[] args)
	{
		int x=7;
		long y = x;
		float z = y;
		System.out.println("Before conversation, int value "+x);
		System.out.println("After conversation, long value"+y);
		System.out.println("After conversation, float value"+z);
	}
}