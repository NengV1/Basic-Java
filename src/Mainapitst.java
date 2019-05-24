public class Mainapitst {

	public static void main(String[] args) {
		
    MystringUtil msu = new MystringUtil();
		
   String cv = msu.convert("Hello");
	String en = msu.encode("Hello");
	System.out.println(msu.Search("Hello","Hello"));
	System.out.println(cv);
	System.out.println(en);
	}
	
}

class MystringUtil{
	public String convert(String input){
		String res="";
		for (int i = input.length(); i> 0;i-- )
		{
			res=res+input.charAt(i-1);
		}		
		
		return res;

	}
	
	public String encode(String input){
		int nextEnd=100;
		String res = "";
		for (int i = 0; i < input.length();i++ )
		{
			char c=input.charAt(i);
			c+=nextEnd;
			res+=c;
		}
		
		return res;
	}
	
	
	public boolean Search(String src,String input){
		return src.contains(input);
	}	
	
}