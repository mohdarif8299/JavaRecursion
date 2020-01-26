
public class FibonacciSeries {

	public static void main(String[] args) {
		for(int i=0;i<8;i++)
		System.out.println(printFIbonacci(i));
	}
	public static int printFIbonacci(int num) {
		if(num==0) return 0;
		else if(num==1) return 1;
		return printFIbonacci(num-1)+printFIbonacci(num-2);
	}

}
