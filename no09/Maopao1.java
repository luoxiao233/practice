class Maopao1 {
	public static void main(String[] args){
		int [] arr = {5,3,6,4};
		paiXu(arr);
		print(arr);
	}
	public static void paiXu(int[] arr){
		for (int i = 0;i < arr.length - 1 ;i ++ ) {
			for (int j = 0;j < arr.length - 1 - i ;j ++ ) {
				if (arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void print(int[] arr){
		for (int i = 0;i < arr.length ;i ++ ) {
			System.out.print(arr[i] + " ");
		}
	}
}