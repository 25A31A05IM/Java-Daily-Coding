class Day6Main3{
	public static void main(String[] args){
		int[] arr = {23, 43, 33, 49, 30};
		System.out.print("The smallest element from the given array is: ");
		int min = arr[0];
		for(int i=0;i<5;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.print(min);
	}
}