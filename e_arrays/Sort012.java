package e_arrays;

public class Sort012 {

	public static void sortFirst(int[] arr) {
		int i = 0, j = 0, k = arr.length - 1;
		
		while(i <= k) {
			if(arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}else if(arr[i] == 1) {
				i++;
			}else {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k--;
			}
		}
	}
	
	public static void sortSecond(int[] arr) {
		int zeroCount = 0, oneCount = 0, twoCount = 0;
		for(int i : arr) {
			if(i == 0) zeroCount++;
			else if(i == 1) oneCount++;
			else if(i == 2) twoCount++;
		}
		int i = 0;
		while(zeroCount > 0) arr[i++] = 0;
		while(oneCount > 0) arr[i++] = 1;
		while(twoCount > 0) arr[i++] = 2;
	}
}
