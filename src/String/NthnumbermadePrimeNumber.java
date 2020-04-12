package String;

public class NthnumbermadePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 21;  
	    System.out.println(getPrime(10)); 
	}
	
	
	public static String getPrime(int number)
	{
		int rem;
		String result ="";
		
		while(number >0)
		{
			rem = number%4;
			
			switch(rem)
			{
			case 1 :
				result += '2';
				break;
			case 2 :
				result += '3';
				break;
			case 3 :
				result += '5';
				break;
			case 4 :
				result += '7';
				break;
			}
				if(number%4==0)
					number--;
				number = number/4;
				
			}
			
		return new StringBuilder(result).reverse().toString();
			
		}
	

}
