
public class P4 {
	public static void main(String args[]) {
		int count = 0;
		int max = - 999999;
		
		for(int i = 100; i < 1000; i++) {
			for(int j = 100; j < 1000; j++) {
				count = i * j;
				int temp, sum = 0;
				int r = 0;
				temp = count;
				while(count > 0) {
					r = count % 10;
					sum = (sum * 10) + r;
					count = count / 10;
				}
				if (temp == sum) {
					if(temp > max) {
						max = temp; 
					}
				}
			}			
		}
		System.out.println(max);
	}
}
