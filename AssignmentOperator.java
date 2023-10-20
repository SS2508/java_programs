class AssignmentOperator {
	public static void main(String[] args) {
		int x,y,z;
		x=30;
		y=x;
		z=x+y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("-----------------------------------------------------");
		x+=100;
		System.out.println(x);
		System.out.println("-----------------------------------------------------");
		y-=10;
		System.out.println(y);
		System.out.println("-----------------------------------------------------");
		z*=5;
		System.out.println(z);
		System.out.println("-----------------------------------------------------");
		x/=5;
		System.out.println(x);
		System.out.println("-----------------------------------------------------");
		y%=2;
		System.out.println(y);
		System.out.println("-----------------------------------------------------");
	}
}