import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class P8 {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("P8.txt"));
		int[] s = new int[1000];
		int f = 0;
		
		while(sc.hasNext()) {
			char[] chararr = sc.nextLine().toCharArray();
			
			for(char c: chararr) {
				s[f] = Character.getNumericValue(c);
				f++;
			}
		}
		
		long result = -9;
		
		for(int i = 0; i < s.length - 12; i++) {
			result = Math.max(result, (long) s[i] * s[i+1] * s[i+2] * s[i+3] * s[i+4]
					* s[i+5] * s[i+6] * s[i+7] * s[i+8] * s[i+9] * s[i+10]
					* s[i+11] * s[i+12]);
		}
		System.out.println(result);
		sc.close();
	}
}
