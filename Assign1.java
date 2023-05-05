abstract class Parent
{
	abstract void message();
}

class Subcls1 extends Parent
{

	@Override
	void message() {
	System.out.println("This is first subclass");
		
	}
	
}
class Subcls2 extends Parent
{

	@Override
	void message() {
		System.out.println("This is second subclass");
		
	}
	
}
public class Assign1 {
	public static void main(String[] args) {
 Subcls1 a=new Subcls1();
 Subcls2 b=new Subcls2();

 a.message();
 b.message();
}
}
