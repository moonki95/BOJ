import java.util.Scanner;

public class _1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A<B) {
			System.out.println("<");
		}
		else if(A>B) {
			System.out.println(">");
		}
		else if(A==B) {
			System.out.println("==");
		}
		sc.close();
	}
}