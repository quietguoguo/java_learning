class Varargs
{
	public static void test (int a , String... books)
	{
		for (String tmp : books)
		{
			System.out.println(tmp);
		}
		System.out.println(a);
	}

        public static void test2 (int a , String[] books)
        {
                for (String tmp : books)
                {
                        System.out.println(tmp);
                }
                System.out.println(a);
        }

	public static void main(String[] args)
	{
		test(5,"asdasdf","asdfxc","dc g");
		test2(343,new String[]{"asdasdf","asdfxc","dc g"});
	}
}
