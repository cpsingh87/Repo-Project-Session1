package AssignmentsOf_6thApril;

public class Assignment4 {
	public static void main(String[] args) 
	{
		// my name is deepak = kapeed si eman ym
		
		String S1= new String("my name is deepak");
		String S2="";
		
		int strlen=S1.length();
		for(int i=strlen-1;i>=0;i--)
		{
			S2=S2+S1.charAt(i);
		}
		System.out.println(S2);
	}

}
