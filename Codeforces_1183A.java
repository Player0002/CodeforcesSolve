import java.util.Scanner;
 
public class test {
	public static int getN(int n) {
		int sum = 0;
		while(n != 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		while(getN(n) % 4 != 0) {
			n++;
		}
		System.out.println(n);
		return;
	}
 
}