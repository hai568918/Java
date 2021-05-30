package Training;

public class Main {
	public static void main(String[] args) {
		System.out.println(Main.maxComNumbers(215));
		System.out.println(Main.leastFactorial(17));
		System.out.println(Main.countSumOfTwoRepresentations2(93, 24, 58));
	}
	
	private static int maxComNumbers(long n) {
		if (n < 4) {
			return -1;
		}
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count += 1;
			}
		}
		if (count >= 1) {
			return count;
		} else {
			return -1;
		}
	}
	
	private static int leastFactorial(long n) {
		int k = 1;
	    int c = 1;
	    while (k < n) {
	        c += 1;
	        k = k*c;
	    }
	    return k;
	}
	
	private static int countSumOfTwoRepresentations2(int n, int l, int r) {
		int a=9;
		int b=a;
	    int count = 0;
	    for (int i = l; i <= n/2; i++) {
	        if((n-l) <= r) {
	            count += 1;
	        }
	    }
	    return count;
	}

}
