public class Puzzle_3_4 {
	// 1 second= 1000 Milliseconds
	// 1 Millisecond = 1000 Microseconds

	// Puzzle 3
	// The expressions 24*60*60*1000*1000 is an int type not a long What you
	// want is 24L*60*60*1000*1000 which is long
	// 24*60*60*1000*1000 is too large to fit into an int and overflows.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println("MICROS PER DAY: " + MICROS_PER_DAY);
		System.out.println("MILLIS PER DAY: " + MILLIS_PER_DAY);
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

		/**
		 * Solution:
		 * 
		 * // TODO Auto-generated method stub final long MICROS_PER_DAY = 24L *
		 * 60L * 60L * 1000L * 1000L; final long MILLIS_PER_DAY = 24L * 60L *
		 * 60L * 1000L; System.out.println("MICROS PER DAY: " + MICROS_PER_DAY);
		 * System.out.println("MILLIS PER DAY: " + MILLIS_PER_DAY);
		 * System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		 * 
		 * 
		 */

		/**
		 * Puzzle 4 Confusion!!!! Avoid using small letter 'l'(L) for long
		 * literals. Always use capital(L) in Long literals.
		 */
		System.out.print("Result of Puzzle 4: Actual puzzle ");
		System.out.println(12345 + 5432l);
		System.out.println("Correct way :");
		System.out.println(12345+54321);
		

	}

}
