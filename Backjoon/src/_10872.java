import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0;
		
		int num = Integer.parseInt(br.readLine());
		if(num>=0 && num<=12) {
			result = fact(num);
			bw.write(String.valueOf(result));
			bw.flush();
		}
		bw.close();

	}
	public static int fact(int num) {
		if(num==0) {
			return 1;
		}
		else if(num<=1) {
			return num;
		}
		return fact(num-1) * num;
		
	}
}
