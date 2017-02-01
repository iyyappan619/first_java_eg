
public class Constructor {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("Main");
	}

}

class parent
{
	parent()
	{
		System.out.println("parent");
	}
}

class Child extends parent
{
	Child()
	{
		System.out.println("Child");
	}
	
}
