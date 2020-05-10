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
		
		int result = -999999;
		
		for(int i=0; i<s.length - 3; i++) {
			result = Math.max(result, s[i]*s[i+1]*s[i+2]*s[i+3]);
		}
		System.out.println(result);
		sc.close();
	}
}
