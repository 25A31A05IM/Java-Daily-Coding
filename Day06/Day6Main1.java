import java.util.Scanner;
class Day6Main1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		int[] arr = new int[5];
		for(int i = 0; i<5; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("The numbers stored in the array are: ");
		for(int i = 0; i<5; i++){
			System.out.println(arr[i]);
		}
		
	}
}