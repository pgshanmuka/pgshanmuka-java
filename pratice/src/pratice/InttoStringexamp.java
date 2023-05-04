package pratice;

public class InttoStringexamp {
	public static void main(String args[])
	{  
		int i=300;  
		String s=String.valueOf(i);  
		System.out.println(i+100);//400 because + is binary plus operator  
		System.out.println(s+100);//300100 because + is string concatenation operator  
		}

}
