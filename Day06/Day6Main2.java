import java.util.Scanner;
class Day6Main2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		System.out.print("Enter any 5 numbers you are needed to sum them: ");
		for(int i = 0; i<5; i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Sum of the given numbers: ");
		for(int i = 0; i<5; i++){
			sum +=arr[i];
		}
		System.out.print(sum);
	}
}