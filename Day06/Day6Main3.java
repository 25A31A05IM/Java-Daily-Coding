class Day6Main3{
	public static void main(String[] args){
		int[] arr = {23, 43, 33, 49, 30};
		System.out.print("The largest element from the given array is: ");
		int max = arr[0];
		for(int i=0;i<5;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.print("The largest number from the given array is: "+max);
	}
}