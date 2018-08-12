package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PrintBExample {
	// Test executes the method in alphabetically order
	// Priority overrides alphabetical execution. Negative values allowed.
	// Lowest value , highest Priority. Default Value = 0..0.
	@Test(priority = -1)
	public void addB() {
		System.out.println("Add B");
	}

	// Invocation Count helps to execute it multiple times. Default Value = 1. If
	// Value = 0 , it will be skipped.
	@Test(priority = 2, invocationCount = 2)
	public void editB() {
		System.out.println("Edit B");
	}

}
