
public class WavePrint {

	public static void wavePrint(int arr[][]){
        if(arr.length == 0){
            return;
        }
        for (int i = 0; i < arr[0].length; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j][i] +" ");
				}
			}else {
				for (int j = arr.length-1; j >= 0; j--) {
					System.out.print(arr[j][i]+" ");
				}
			}
		}
	}

}