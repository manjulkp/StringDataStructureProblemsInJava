package String;

public class LexicographicRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "string"; 
        getRank(str);

	}
	
	
	public static int factorial(int n)
	{
		if (n ==1 || n==0)
			return 1;
		return n*factorial(n-1);
	}
	
	
	public static void getRank(String s)
	{
		int Rank = 1;
		int combination = factorial(s.length());
		
		for(int i=0;i<s.length();i++)
		{
			combination = combination/(s.length()-i);
			
			int lowerRankCount = getLowerRankInRightSide(s,i,s.length());
			
			Rank = Rank + combination*lowerRankCount;
		}
		
		System.out.println("the lexicographic rank is " + Rank);
	}
	
	public static int getLowerRankInRightSide(String str,int i,int length)
	{
		int count =0;
		
		for(int j = i+1;j<length;j++)
		{
			if(str.charAt(i) > str.charAt(j))
			{
				count++;
			}
		}
		return count;
		
	}

}
