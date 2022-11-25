import java.util.Scanner;

public class Test2{
	public static void main (String[]args){
		int num1;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter frist kilometer:");
		num1 =input.nextInt();
		
		if (num1 >=7){
				System.out.printf("cost%d$",(num1-7)*5+85);
				
		}
		else{
				System.out.println("cost85$");
		}
	}
}