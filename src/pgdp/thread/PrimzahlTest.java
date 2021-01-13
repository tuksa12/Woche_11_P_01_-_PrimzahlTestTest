package pgdp.thread;

import java.util.function.Function;

public class PrimzahlTest {
	public static Function<Integer, Boolean> testFunc;

	public static boolean isPrime(int x) {
		return testFunc.apply(x);
	}
}
