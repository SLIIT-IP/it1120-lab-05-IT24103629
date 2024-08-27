import java.util.Scanner;
	public class IT24103629Lab5Q1
	{
		public static void main(String[] args)
		{
		  Scanner numin = new Scanner(System.in);
		  
		  System.out.print("Enter the first integer: ");
		  int num1 = numin.nextInt();
		  
		  System.out.print("Enter the second integer: ");
		  int num2 = numin.nextInt();
		  
		  System.out.print("Enter third integer: ");
		  int num3 = numin.nextInt();
		  
		  int max, min;
		  
		  max = num1;
		   
		   if(num2>max)
		   {
			   max = num2;
		   }
		   if(num3>max)
		   {
			   max = num3;
		   }
		   
		   min = num1;
		   
		   if(num2<min)
		   {
			   min=num2;
		   }
		   if(num3<min)
		   {
			   min = num3;
		   }
		   
		   System.out.println("\nUser entered number are : "+num1+" "+num2+" "+num3);
		   
		   System.out.println("The Smallest number is: "+min);
		   System.out.print("The Largest number is: "+max);
		}
	}
	