package pgdp.thread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimzahlTestTest {
	@BeforeEach
	public void setImplementation() {
		PrimzahlTest.testFunc = x -> {
			for (int t = 2; t < t * t && t * t <= x; t++)
				if (x % t == 0)
					return false;
			return x > 1;
		};
	}
}
