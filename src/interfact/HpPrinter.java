package interfact;

public class HpPrinter extends MyPrinter implements Scanner,Fax{

	@Override
	public void fax() {
		System.out.println("hp f");
		
	}

	@Override
	public void scan() {
		
		System.out.println("hp s");
	}

	@Override
	public void print() {
		
		System.out.println("hp p");
	}

	

	
}
