package AssignmentsOf_6thApril;

public class Assignment1 {
	
	// my name is deepak = deepak is name my 

	public static void main(String[] args) 
	{
		String S1=new String("my name is deepak");
		String[] S2= S1.split(" ");
		
		int l=S2.length;
		System.out.println(S1);
		for(int i=(l-1);i>=0;i--)
		{
			//System.out.println("inside loop");
			System.out.print(S2[i]+" ");
		}
	}
}
