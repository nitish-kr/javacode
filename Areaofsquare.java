class Areaofsquare
{
	public static void main(String arg[])
	{
		float result = calculateSum(6,6,3,3);
		System.out.println(result);
	}

	public static float calculateSum(int x1,int y1,int x2,int y2)
		{

			float d= pow(pow((x1-x2),2) + pow((y1-y2),2),1/2.0);
			float area=(1/2.0)*d*d;
			return area;

			
		}
}