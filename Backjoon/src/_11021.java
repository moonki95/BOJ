import java.util.Scanner;

public class _11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test_case;
		
		
		Scanner sc = new Scanner(System.in);
		
		test_case = sc.nextInt();
		int a[] = new int[test_case];
		int b[] = new int[test_case];
		int sum[] = new int[test_case];
		
		for(int i=0;i<test_case;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			sum[i] = a[i] + b[i];
		}
		
		for(int i=0;i<test_case;i++) {
			System.out.println("Case #"+(i+1)+": "+ (a[i] +" + " + b[i]) + " = " +sum[i]);
		}
	}
}
