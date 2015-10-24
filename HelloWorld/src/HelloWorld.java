import java.util.Optional;
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
	public static void main(final String[] args) {
		System.out.println("Hello ASE2015 - how are you now? :)");
		try (final Scanner sc = new Scanner(System.in);) {
			final Optional<String> input = Optional.of(sc.nextLine());
			HelloUser.greetUser(input);
		}
	}

}
