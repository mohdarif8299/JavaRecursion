import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("Factorial is " + printFactorial(num));
	}

	public static int printFactorial(int num) {
		if (num == 1)
			return 1;
		return num * printFactorial(num - 1);
	}
}
