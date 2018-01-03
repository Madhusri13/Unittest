package testrunner;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Test_file1 {


	public void test() {
		fail("Not yet implemented");
	}
@Test
public void test_junit() {
	Multiply s1 = new Multiply(5,4);
	Assert.assertEquals(20,s1.multiplication());
}
@Test
public void test_junit2() {
	Multiply s2 = new Multiply(20,4);
	Assert.assertEquals(20,s2.divide());
}
}
