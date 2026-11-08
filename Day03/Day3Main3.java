import java.util.Scanner;
class Day3Main3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		if(marks>100) System.out.println("Please enter correct marks");
		else{
				if(marks<=100 && marks>=90) System.out.println("A");
				else if(marks<=89 && marks>=80) System.out.println("B");
				else if(marks<=79 && marks>=70) System.out.println("C");
				else if(marks<=69 && marks>=60) System.out.println("D");
				else System.out.println("Fail");
		}
	}
}