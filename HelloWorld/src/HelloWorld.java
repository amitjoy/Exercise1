
/*******************************************************************************
 * Copyright 2015 TU Munich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
import java.util.Optional;
import java.util.Scanner;

/**
 * Main Application Client
 *
 * @author Tobias
 * @author AMIT KUMAR MONDAL
 */
public final class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		System.out.println("Hello ASE2015 - how are you now? :)");
		try (final Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter Your Name: ");
			final Optional<String> input = Optional.of(sc.nextLine());
			HelloUser.greetUser(input);
		}
	}

}
