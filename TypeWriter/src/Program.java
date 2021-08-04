import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Program {

	public static void main(String[] args) {
		print("This string will be \"typed\" out letter by letter.", 50);
		print("Here is an example of typing out an integer\n" + 1234 + "\n", 80);
		print("And a float: " + 1.234, 0);
		
		System.out.println("You can write some string:");
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
//		scanner.nextLine();
		System.out.println("Write a typing delay in milliseconds:");
		long delay = scanner.nextLong();
		print(s, delay);

	}
	
	static void readString() {
		
	}
	
	static void print(String str, long delay) {
		System.out.println();
		for ( char c : str.toCharArray()) {
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}
