package Abstract;

public abstract class MyGraphics {
	private int x;
	private int y;
	public abstract void draw();
	public abstract double findArea();
	
	public void move(int x , int y){
		this.setX(x);
		this.setY(y);
	}
	
	public  static void move(MyGraphics graphic,int x , int y){
		graphic.setX(x);
		graphic.setY(y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public MyGraphics() {

	};

	public MyGraphics(int x,int y) {
		this.x = x;
		this.y = y;
	};
	
	
	
	
}
