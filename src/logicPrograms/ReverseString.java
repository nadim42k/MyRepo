package logicPrograms;

public class ReverseString {

	
	public static void main(String[] args) {
		
	
	String  Original = "Nadim" ;
	
	String reverse = "" ;
	
	for(int i = Original.length()-1; i>=0; i--)
	{
		reverse = reverse + Original.charAt(i);
	}
	
	System.out.println(reverse);
	
	
	}
	
	
	
	
	
	
	
	
}
