package Abstract;

public class TestGraphics {

	public static void main(String[] args) {
		MyGraphics cir = new MyCircle(10);
		
		System.out.println(cir.findArea());
		//cir.move(50, 50);
		MyGraphics.move(cir, 10, 10);
		System.out.println(cir.getX()+","+cir.getY());
	}

}
