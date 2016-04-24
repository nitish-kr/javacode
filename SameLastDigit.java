class SameLastDigit
{
	public static void main(String arg[])
	{
		boolean res=checksame(34,124);
		System.out.println(res);
	}
	public static boolean checksame(int num1,int num2)
	{
		return (num1%10==num2%10) ?  true : false;
	}
}