import java.util.Scanner;
class MagicalArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of N - ");
		int N = s.nextInt();
		int[] arr = new int[N];
		System.out.println("Enter numbers in array - ");
		int lastDigit, magicNum = 0;
		for (int i=0;i<N;i++) {
			arr[i] = s.nextInt();
			lastDigit = arr[i] % 10;
            magicNum = magicNum * 10 + lastDigit;
            //System.out.println(magicNum);
		}
		if (isPrime(magicNum)) {
            System.out.println(magicNum+" -> Yes");
        } else {
            System.out.println(magicNum+" -> No");
        }
	}
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}