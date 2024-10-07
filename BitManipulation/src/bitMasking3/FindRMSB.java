package bitMasking3;

public class FindRMSB {
	public static void main(String[] args) {
		int n = 40;
		//brute force approach find Right Most Significand Bit Time complexity is O(logN)
		int position = worstCase(n);
		System.out.println(position);
		//best way to find Right Most Significand Bit Time complexity is O(1)
		position = bestCase(n);
		System.out.println(position);
	}

	private static int bestCase(int n) {
		//this is the long way but its Big O(1) only
//		int m  = n-1;
//		n = n^m;
//		int result = (int)(Math.log10(n)/Math.log10(2));
//		return result+1;
		
		//if you want this is one line then it is also posible
		return (int)(Math.log10(n ^ (n-1))/Math.log10(2))+1;
	}

	private static int worstCase(int n) {
		if(n == 0) {
			return -1;
		}
		
		int m = 1;
		int position = 0;
		
		while((n&m) == 0) {
			m = m<<1;
			position++;
		}
		return ++position;
	}
}
