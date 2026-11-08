import java.util.Scanner;
class Day4Main4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int i = 0;
		int fact = 1;
		if(num==0 && num==1) System.out.println("1");
		else{
			i = num;
			while(i>1){
				fact *= i;
				i--;
			}
			System.out.println("Factorial of the given number is: "+fact);
		}
	}
}