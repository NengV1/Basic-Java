package interfact;

public class TestPrint {
public static void main(String[] args) {
	MyPrinter hp = new HpPrinter();
	MyPrinter ep = new EqsonPrinter();
	Fax sc = new HpPrinter();

	
	HpPrinter hpm = (HpPrinter) hp;
	hpm.fax();
	hpm.print();
	hpm.scan();
	
	EqsonPrinter eqm = (EqsonPrinter) ep;
	eqm.print();
	eqm.scan();
}
}
