class Day6Main6{
	public static void main(String[] args){
		int[] arr = {12, 13, 14, 15, 16, 17, 18, 19};
		int even = 0, odd = 0;
		System.out.print("The count of the no of numbers that are even and odd int the given array: ");
		for(int i=0; i<8; i++){
			if(arr[i]%2==0) even++;
			else if(arr[i]%2!=0) odd++;
			else System.out.println("What the Fck are u doing bro do it properly without giving zero to the array 😒");
		}
		System.out.print("Even= "+even);
		System.out.print("Odd= "+odd);
	}
}