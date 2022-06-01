package mock7;

public class SubClass1 implements Interface1
{
	public int m1()
	{
		int a=2;
		return(a);
	}
	public static void main(String[] args) 
	{
		SubClass1 x=new SubClass1();
		System.out.println(x.m1());
	}

	

}
