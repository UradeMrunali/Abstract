abstract class Test
{
  	Test()
	{
		System.out.println("This is constructor of abstract class");
	}
  	 abstract void a_method();
  	 
  	 void b_method()
  	 {
  		 System.out.println("This is normal method of abstract class");
  	 }
}
 class SubClass extends Test
 {

	@Override
	void a_method() {
		System.out.println("This is abstract method");
		
	}
	 
 }


public class Assign4 {
	public static void main(String[] args) {
		SubClass s=new SubClass();
		s.a_method();
		s.b_method();
		
		
	}

}
