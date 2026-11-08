import java.util.Scanner;
class Day4Main5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to reverse it: ");
		int num = sc.nextInt();
		int rev = 0;
		int rem;
		while(num>0){
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		System.out.println("Reverse of the number is: "+rev);
	}
}