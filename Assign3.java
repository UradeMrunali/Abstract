
abstract class Animals
{
	abstract void cats();
	abstract void dogs();
}

class Cats extends Animals
{

	@Override
	void cats() {
	System.out.println("Cats meow meow");
		
	}

	@Override
	void dogs() {
		// TODO Auto-generated method stub
		
	}

	
}
class Dogs extends Animals{

	@Override
	void cats() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void dogs() {
		System.out.println("Dogs bhaoo bhaoooo");
		
	}
	
}



public class Assign3 {
	public static void main(String[] args) {
		 Cats c=new Cats();
		 Dogs d=new Dogs();
		 
		 c.cats();
		 d.dogs();
	}

}
