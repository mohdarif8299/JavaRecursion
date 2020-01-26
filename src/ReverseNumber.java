import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (printReverse(0, num) == num) {
			System.out.println("Palindrome Number");
		} else
			System.out.println("Not Palindrome");
	}

	public static int printReverse(int sum, int num) {
		if (num == 0)
			return sum;
		return printReverse((sum * 10) + num % 10, num / 10);
	}
}
