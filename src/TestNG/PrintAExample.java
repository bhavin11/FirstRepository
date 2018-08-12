package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintAExample {
	// Test executes the method in alphabetically order
	// Priority overrides alphabetical execution. Negative values allowed.
	// Lowest value , highest Priority. Default Value = 0..0.
	@Test(priority = -1)
	public void addA() {
		System.out.println("Add A");
	}

	// Invocation Count helps to execute it multiple times. Default Value = 1. If
	// Value = 0 , it will be skipped.
	@Test(priority = 2, invocationCount = 2)
	public void editA() {
		System.out.println("Edit A");
	}

	// Enabled function helps to skip or execute the function.
	@Test(priority = 3, enabled = false)
	public void deleteA() {
		System.out.println("Delete A");
	}

	// Manually failing a test method
	@Test(priority = 4)
	public void failA() {
		AssertJUnit.fail();
		System.out.println("Fail A");
	}

	// Method Dependency on other job for execution
	@Test(priority = 5, dependsOnMethods = "failA")
	public void dependA() {
		System.out.println("Depends on failA");
	}
}
