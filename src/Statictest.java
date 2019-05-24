
public class Statictest {

	public static void main(String[] args) {
		
		MyStu sl = new MyStu("123","jacky","neng@mail");
		
		System.out.println(sl.getEmail());
	
		
		MyStu sl1 = new MyStu("1231","jacky1","neng@mail1");
		System.out.println(sl1.getEmail()+"="+	MyStu.getCounter());
		MyStu.getDetail();
	}

}

class MyStu{
	private String id;
	private String name;
	private String email;
	static int counter;
	
	public MyStu(){
		this(null,null,null);
	}
	
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		MyStu.counter = counter;
	}

	public MyStu(String id,String name,String email) {
		this.id = id;
		this.email= email;
		this.name = name;
		counter++;
	}
	
	public static void getDetail() {
		System.out.println("Total"+getCounter());
		
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}