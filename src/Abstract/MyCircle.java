package Abstract;

public  class MyCircle extends MyGraphics{
	
	private double radis;

	
	
	public MyCircle() {
	
	}
	
	public MyCircle(double radis) {
		this.radis = radis;
	}

	public MyCircle(double radis,int x, int y) {
		super(x, y);
		this.radis = radis; 
	}

	@Override
	public void draw() {
	
		
	}


	@Override
	public double findArea() {
		return (22/7)*radis*radis;
		
	}
	
	@Override
	public void move(int x, int y) {
	
		super.move(x, y);
	}



	public double getRadis() {
		return radis;
	}



	public void setRadis(double radis) {
		this.radis = radis;
	}



	

	
	
	
}
