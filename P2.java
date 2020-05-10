
public class P2 {
	public static void main(String args[]) {
		int n1 = 0, n2 = 1, n3, count = 0;
		for(int i = 0; i < 50; i++) {
			n3 = n1 + n2;
			if(n3 < 4000000) {
				if(n3 % 2 == 0) {
					count += n3;
				}
			}
			else if(n3 > 4000000) {
				continue;
			}
			n1 = n2;
			n2 = n3;
		}
		System.out.println(count);
	}

}
