import java.util.Scanner;

class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter year:");
		int year=s.nextInt();
		if(year%4==0)
		{
			System.out.println(year+" is a Leap Year.");
		}
		else
		{
			System.out.println(year+" is not a Leap Year");
		}
	}
}