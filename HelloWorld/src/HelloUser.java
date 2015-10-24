/*******************************************************************************
 * Copyright 2015 Amit Kumar Mondal <admin@amitinside.com>
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
import java.util.function.UnaryOperator;

/**
 * Used to greet user
 *
 * @author AMIT KUMAR MONDAL
 *
 */
public final class HelloUser {

	/**
	 * Returns the name if provided
	 *
	 * @param userName
	 *            the optional name
	 */
	public static void greetUser(final Optional<String> userName) {
		final UnaryOperator<String> mapper = name -> "Hello " + name + "!";
		userName.map(mapper).ifPresent(System.out::println);
	}

	/**
	 * Constructor
	 */
	private HelloUser() {
		// Not Required
	}

}
