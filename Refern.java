class DataWrap
{
	int a ;
	int b ;
}
public class Refern
{
	public static void swap(DataWrap dw)
	{
		int tmp = dw.a ;
		dw.a = dw.b ;
		dw.b = tmp ;
		System.out.println("swap dw.a="+dw.a+" dw.b="+dw.b);
	}	
	public static void main(String[] args)
	{
		DataWrap dw = new DataWrap() ;
		dw.a = 1 ;
		dw.b = 2 ;
		swap(dw) ;
		System.out.println("main dw.a="+dw.a+" dw.b="+dw.b);
	}
}
