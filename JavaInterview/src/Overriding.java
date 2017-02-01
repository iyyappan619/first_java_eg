
public class Overriding {

}

class A
{
	int i=10;
	A()
	{
		System.out.println(i);
	}
}

class B extends A
{
	int j;
	B()
	{
		System.out.println(j);
	}
}