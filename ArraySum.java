class ArraySum 
{
	public static void main(String[] args) 
	{
		String[] fname = new String[5];
		fname[0] = "Shivani";
		fname[1] = "Shweta";
		fname[2] = "Rajesh";
		fname[3] = "Tanmay";
		fname[4] = "Vishalakshi";

		String[] lname = new String[5];
		lname[0] = "Shivgunde";
		lname[1] = "Shivgunde";
		lname[2] = "Mateti";
		lname[3] = "Chavan";
		lname[4] = "Bicchal";

		for(int i=0;i<5;i++)
		{
			String[] fullname = new String[5];
			fullname[i] = fname[i]+" "+lname[i];
			System.out.println(fullname[i]);
		}
	}
}