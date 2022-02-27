class Conversation
{
	public static void main(String args[])
	{
	byte d;
	double i = 257;
	System.out.println("\nconversion of int to byte.");
	d = (byte) i;
	System.out.println("i and d " + i + " " + d);
	System.out.println("\nConversion of double to int.");
	i = (int) d;
	System.out.println("d and i " + d + " " + i);
	System.out.println("\nConversion of double to  byte.");
	d = (byte) d;
	System.out.println("d and b " + d + " " + d);
	}
}