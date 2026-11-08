import java.util.Scanner;
class Day4Main2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that you want: ");
		int table = sc.nextInt();
		int i = 1;
		while(i<=10){
			System.out.println(table+" x "+i+" = "+(table*i));
			i++;
		}
	}
}