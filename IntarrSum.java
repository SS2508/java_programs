class IntarrSum {
	public static void main(String[] args) {
		int[] num1={10,20,30,40,50};
		int[] num2={100,200,300,400,500};
		int[] rsum=num1;
		for (int i=0;i<5;i++) {
			rsum[i]+=num2[i];
			System.out.println(rsum[i]);
		}
	}
}