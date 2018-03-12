class Swap
{
	public static void swap(int a , int b )
 	{
		int tmp = a ;
		a = b ;
		b = tmp ;
		System.out.println("swap a="+a+" b="+b);
	}
	public static void main(String[] args )
	{
		int a = 1 ;
		int b = 2 ;
		swap (a,b) ;
		System.out.println("a="+a+" b"+b);
	}
}
