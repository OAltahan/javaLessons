import java.util.Scanner;

public class InteractiveProgram {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("What is your name?...");
		String name = scan.nextLine();
		System.out.println("How old are you?...");
		int age = scan.nextInt();
		System.out.println("What is your phone number?...");
		long phone = scan.nextLong();

		System.out.println("Welcome " + name + "\nYou are " + age + " years old\nTel: " + phone);
	}

}
