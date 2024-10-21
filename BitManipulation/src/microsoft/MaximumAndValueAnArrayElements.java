package microsoft;

public class MaximumAndValueAnArrayElements {
	public static void main(String[] args) {
		int[] arr = {16, 9, 6, 13};
		int result = maxAndValue(arr);
		System.out.println(result);
	}

	private static int maxAndValue(int[] arr) {
		int mask = 0;
		int res = 0;
		
		for(int i = 31; i >= 0; i--) {
			mask = (1<<i) | res;
			
			int count = checkBits(mask, arr); 
			
			if(count >= 2) {
				res = res | mask;
			}
		}
		return res;
	}

	private static int checkBits(int mask, int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if((mask & arr[i]) == mask) {
				count++;
			}
		}
		return count;
	}
	
	
}
