import java.util.Scanner;
class Day2Main1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b values: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Divison: "+(a/b));
		System.out.println("Remainder: "+(a%b));
	}
}