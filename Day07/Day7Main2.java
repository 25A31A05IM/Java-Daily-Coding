import java.util.Scanner;
class Day7Main2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String my_name=sc.nextLine();
		System.out.println(my_name);
		System.out.println(my_name.length());
		System.out.println(my_name.toUpperCase());
	}
}