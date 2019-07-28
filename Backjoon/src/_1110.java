import java.util.Scanner;

public class _1110 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		int result = num;

		do {
			result = result % 10 * 10 + (result / 10 + result % 10) % 10;
			cnt++;
		}
		while(num != result);
		System.out.println(cnt);
		sc.close();
	}

}
