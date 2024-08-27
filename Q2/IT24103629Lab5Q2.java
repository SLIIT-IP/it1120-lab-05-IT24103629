import java.util.Scanner;
public class IT24103629Lab5Q2
{
	public static void main(String[] args)
	{
		Scanner noin = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		int newMember = noin.nextInt();
		
		if (newMember<0)
		{
			System.out.println("Input must be a number 0 or greater.");
		}
		else if(newMember == 0)
		{
			System.out.print("No price");
		}
		else{
			String prize;
			switch(newMember)
			{
				case 1:
				prize = "Pen";
				break;
				
				case 2:
				prize = "Umbrella";
				break;
				
				case 3:
				prize = "Bag";
				break;
				
				case 4:
				prize = "Travelling Bag";
				break;
				
				default:
				prize = "Headphone";
				break;
			}
			System.out.print("Prize is a: "+prize);
		}
		noin.close();
	}
}