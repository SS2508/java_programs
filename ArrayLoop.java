class ArrayLoop {
	public static void main(String[] args) {
		String[] names = new String[5];

		names[0] = "Shivani";
		names[1] = "Shweta";
		names[2] = "Rajesh";
		names[3] = "Tanmay";
		names[4] = "Zaheer";

		int i=0;
		while(i<5)
		{
			System.out.println(names[i]);
			i++;
		}
	}
}