package Package1;

public class BreakSentenceWordByWord {
	public static void main(String[] args) 
	{
		String S1=new String("My Name is Deepak");
		String[] S2=S1.split(" ");
		
		int l=S2.length;
		
		for (int i=0;i<l;i++)
		{
//			System.out.println("inside loop");
			System.out.println(S2[i]);
		}			
	}
}
