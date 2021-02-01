package pgdp.thread;

import java.util.function.IntFunction;

public class PrimzahlTest {
	// This indirect call of the function is required to test your tests in
	// artemis. With the function being an attribute it can be manipulated to
	// insert a faulty function and check whether your tests detect it.
	public static IntFunction<Boolean> testFunc;

	public static boolean isPrime(int x) {
		return testFunc.apply(x);
	}
}
