package bitMasking3;

public class CountSetBit {
	public static void main(String[] args) {
		int n = 654564545;
		//brute force approach O(log n)
		int result = countRSB(n);
		System.out.println(result);
		//best approach O(log n)
		result = countRSBBest(n);
		System.out.println(result);
	}

	private static int countRSBBest(int n) {
		int count = 0;
		while(n > 0) {
			n = n & (n-1);
			count++;
		}
		return count;
	}

	private static int countRSB(int n) {
		if(n == 0) {
			return -1;
		}
		
		int count = 0;
		int mask = 1;
		int pos = 0;
		while(pos <= n) {
			if((n & mask) > 0) {
				count++;
				pos += n & mask;
			}
			
			pos += n &mask;
			mask = mask << 1;
		}
		return count;
	}

}
