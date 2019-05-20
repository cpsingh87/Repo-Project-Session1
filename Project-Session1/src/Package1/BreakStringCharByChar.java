package Package1;

public class BreakStringCharByChar {
	public static void main(String[] args) 
	{
		String s=new String("Deepak");
		int l=s.length();
		
		for(int i=0;i<l;i++)
		{
			System.out.println(s.charAt(i));
		}
	}
}
