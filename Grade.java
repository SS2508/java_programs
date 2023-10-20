import java.util.Scanner;

class Grading  
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter first subject marks - ");
		float m1=s.nextFloat();
		System.out.print("Enter second subject marks - ");
		float m2=s.nextFloat();
		System.out.print("Enter third subject marks - ");
		float m3=s.nextFloat();
		float avg = (m1 + m2 + m3)/3;
		if (avg>=80) {
			System.out.println("A+");
		}else if(avg>=70){
			System.out.println("A");
		}else if(avg>=60){
			System.out.println("B");
		}else if(avg>=50){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
	}
	
}