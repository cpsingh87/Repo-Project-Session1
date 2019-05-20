package AssignmentsOf_6thApril;

public class Assignment2 {
	public static void main(String[] args) 
	{
		// my name is deepak = ym eman si kapeed
		
		String S1= new String("my name is deepak");
		String S2="";
		
		System.out.println(S1);
		
		//Apply Logic for StringPalindromeOrNot. It will Reverse the String first.
		int strlen=S1.length();
		for(int i=strlen-1;i>=0;i--)
		{
			S2=S2+S1.charAt(i);
		}
		
		//Then Apply logic for Assignment1.java i.e. to bring last word to front and front word to last.
		String[] S3=S2.split(" ");
		int strlen3=S3.length;
		
		for(int j=(strlen3-1);j>=0;j--)
		{
			//System.out.println("inside loop");
			System.out.print(S3[j]+" ");
		}
	}
}	