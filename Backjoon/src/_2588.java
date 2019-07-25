import java.util.Scanner;

public class _2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int res1 = 0;
		int res2 = 0;
		int res3 = 0;
		int res4 = 0;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		res1 = a * (b%100%10);
		res2 = a * (b%100/10);
		res3 = a * (b/100);
		res4 = res1 + (res2 * 10) + (res3 * 100);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		sc.close();
	}

}
