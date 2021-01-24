package pgdp.thread;

import java.util.function.IntFunction;

public class PrimzahlTest {
	public static IntFunction<Boolean> testFunc;

	public static boolean isPrime(int x) {
		return testFunc.apply(x);
	}
}
