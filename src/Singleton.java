
public class Singleton {

	public static void main(String[] args) {
		

		HouseCreate hc = HouseCreate.getIns();
		House h1 =hc.createH("sdsad", "ddd");
		//House h2 =hc.createH("dd", "ss");
		System.out.println(h1.getAddress());
//		House h1;
//		for(int i=0 ;i<10;i++){
//			h1 = new House("sd"+(i+1),"red");
//			System.out.println(h1.getAddress()+" "+h1.getColor());
//			
//		}

	}

}

class HouseCreate{
	private static HouseCreate instance = new  HouseCreate();
	private HouseCreate(){
		
	}
	
	public static HouseCreate getIns() {
		return instance;
	}

	public House createH(String address,String  color) {
	
		return new House(address, color);
	    
  }
}

class House{
	private String address;
	private String color;

	public House(){
		
	}
	
	public House(String address, String color) {
		
		this.address = address;
		this.color = color;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}