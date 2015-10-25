import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you? :)");
		System.out.print("Please enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		HelloUser hu = new HelloUser(name);
		hu.greetUser();
	}

}
