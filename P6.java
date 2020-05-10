
public class P6 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		int sumsquare = sum * sum;
		
		int squaresum = 0;
		for(int i = 0; i <= 100; i++) {
			squaresum += (i * i);
		}
		
		System.out.println(sumsquare - squaresum);
	}
}
