import java.util.Scanner;
class Day6Main7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers you want: ");
		int[] arr = new int[5];
		System.out.println("Enter the key element that you want to search: ");
		int key = sc.nextInt();
		for(int i = 0; i<5; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("The element you are looking for is at the index: ");
		for(int i=0; i<5; i++){
			if(arr[i]==key) 
				System.out.print(i);
		}
	}
}