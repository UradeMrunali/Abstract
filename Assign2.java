
abstract class Bank
{
	abstract void getBalance();
}

class BankA extends Bank
{

	@Override
	void getBalance() {
		System.out.println("$100 is deposited");
		
	}
	
}
class BankB extends Bank
{

	@Override
	void getBalance() {
		System.out.println("$150 is deposited");
		
	}
	
}
class BankC extends Bank
{

	@Override
	void getBalance() {
		System.out.println("$200 is deposited");
		
	}
	
}


public class Assign2 {
	public static void main(String[] args) {
		
	BankA A=new BankA();
	BankB B=new BankB();
	BankC C=new BankC();
	 
	A.getBalance();
	B.getBalance();
	C.getBalance();
	
	}
}
