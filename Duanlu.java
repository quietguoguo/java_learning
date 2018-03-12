class Duanlu
{
	public static void main(String[] args)
	{
		int a = 5 ;
		int b = 19;
		if ( a > 5 && b++ > 18 )
		{
			System.out.println("hello");
		}
		System.out.println("&&"+a+" "+b);
                if ( a > 5 & b++ > 18 )
                {
                        System.out.println("hello");
                }
                System.out.println("&"+a+" "+b);
	}
}
