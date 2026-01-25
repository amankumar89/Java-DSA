
public class SumOfBoundriesAndDiagonals {

	public static void totalSum(int[][] arr) {
		if(arr.length == 0) {
			System.out.println(0);
			return;
		}
		
		int diagonalSum1 = 0;
		int i = 0;
		int j = 0;
		while(i < arr.length && j < arr[0].length) {
			diagonalSum1 += arr[i][j];
			i++;
			j++;
		}
		
		int diagonalSum2 = 0;
		i = 0;
		j = arr[0].length-1;
		while(i < arr.length && j >= 0) {
			if(i != j) {
				diagonalSum2 += arr[i][j];
			}
			i++;
			j--;
		}
		
		int boundrySum = 0;
		
		for (int k = 1; k < arr.length-1; k++) {
			// top
			boundrySum += arr[0][k];
			// right
			boundrySum += arr[k][arr.length-1];
			// bottom
			boundrySum += arr[arr.length-1][k];
			// left
			boundrySum += arr[k][0];
		}
		
		System.out.println(diagonalSum1 + diagonalSum2 + boundrySum);
	}

}