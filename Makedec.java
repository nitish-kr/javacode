/*
	*
	*Nitish Kumar Ojha
	*IGNOU (BCA)
	*
 */
class Makedec
{
	public static float todec(int num1,int num2,int num3)
	{
		return (float)((num1*100)+(num2*10)+(num3))/100;
	}
	public static void main(String arg[])
	{
		float res=todec(2,3,5);
		System.out.println(res);
	}
}