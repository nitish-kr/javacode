class Fibonacci
{
	public static int fibonacci2(int num)
	{
		int i,fibo1=0, fibo2=1, fibonacci=1;
		for(i= 2; i<= num; i++)
		{
			fibonacci = fibo1 + fibo2;             
            fibo1 = fibo2;
            fibo2 = fibonacci;
		}
		return fibonacci;

	}
	public static void main(String args[])
	 { 

	 	int i,num=8;
	 	for(i=1;i<=num;i++)
	 		System.out.print(fibonacci2(i) +" ");
	 }


}