import java.util.Scanner;
public class IT24103629Lab5Q3
{
	public static void main(String[] args)
	{
		Scanner dateIn = new Scanner(System.in);
		
		System.out.print("Enter start date: ");
		int startDate = dateIn.nextInt();
		
		System.out.print("Enter end date: ");
		int endDate = dateIn.nextInt();
		
		if(startDate<endDate)
		{
			if (startDate >= 1 && startDate <= 31 && endDate >= 1 && endDate <= 31)
			{
				int daysreserved = endDate-startDate;
				
				int disc;
				switch(daysreserved)
				{
					case 1:
					disc = 0;
					break;
					
					case 2:
					disc = 0;
					break;
					
					case 3:
					disc = 10;
					break;
					
					case 4:
					disc = 10;
					break;
					
					default:
					disc = 10;
					break;
				}
				double totbill = 48000 * daysreserved;
				double discbill = totbill * disc / 100;
				double finalbill = totbill-discbill;
				
				System.out.print("Total amount to be paid: " +finalbill);
			}
			else
			{
				System.out.print("Days must be between 1 and 31");
			}
		}
		else 
		{
			System.out.print("Error: Start date must be less than End Date");
		}
	}
}
