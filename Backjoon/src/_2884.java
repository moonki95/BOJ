import java.util.Scanner;

public class _2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int H,M;
		int M_2 = 0;
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		M = sc.nextInt();
		
		if(M < 45) {
			if(H == 0) {
				H += 24-1;
				M_2 = M + 60 - 45;
				System.out.print(H+" ");
				System.out.print(M_2);
			}
			else {
				H--;
				M_2 = M + 60 - 45;
				System.out.print(H+" ");
				System.out.print(M_2);
			}
		}
		else {
			System.out.print(H+" ");
			System.out.print(M-45);
		}
		sc.close();
	}
}
