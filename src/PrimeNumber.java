import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int flag = checkPrime(num,2);
		if(flag==1) System.out.println("Prime");
		else System.out.println("Not Prime");
	}
	public static int checkPrime(int num,int i) {
		if(num==i) return 1;
		else {
			if(num%i==0) return 0;
			else 
				return checkPrime(num,i+1);
		}
	}
}
