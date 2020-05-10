
public class P7 {
	public static void main(String args[]) {
		int n = Integer.MAX_VALUE, count, i;
		int totalcount = 0;
		for(int j = 2; j <= n; j++) {
			count = 0;
			for(i = 1; i <= j; i++) {
				if(j % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				totalcount++;
				if(totalcount == 10001) {
					System.out.println(j);
					System.exit(0);
				}
			}
		}
	}
}
