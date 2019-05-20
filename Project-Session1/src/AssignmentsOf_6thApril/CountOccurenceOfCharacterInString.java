package AssignmentsOf_6thApril;

public class CountOccurenceOfCharacterInString {
	public static void main(String[] args) 
	{
		String S1=new String("my name is deepak");
		int strlen=S1.length();
		int count=0;
		for(int i=0;i<=strlen-1;i++)
		{
			if(S1.charAt(i)=='e')
			{
				count++;
			}
		}
		System.out.println("Character 'e' has occured "+count+" times");
	}

}
