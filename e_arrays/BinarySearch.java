package e_arrays;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target) {
		if(arr == null || arr.length <= 0) return -1;
		
		int start = 0, end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) return mid;
			else if(arr[mid] < target) start = mid + 1;
			else end = mid - 1;
		}
		return -1;
	}
}
