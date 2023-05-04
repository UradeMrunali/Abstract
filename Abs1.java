
abstract class Abs2{
	abstract void AI();
	abstract void cctv();
	abstract void musicsystem();	
}

 class Abs3 extends Abs2{

	
	void AI() {
		System.out.println("this is new model ai");
		
	}

	
	void cctv() {
		System.out.println("new model cctv");		
	}

	
	void musicsystem() {
		System.out.println("this is new model music system");
		
	}
	
}
public class Abs1 {
 public static void main(String[] args) {
	Abs3 a= new Abs3();
	a.AI();
	a.cctv();
	a.musicsystem();
}
	
}
