package fold;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import calc.adding;

public class addTest {

	@Test
	public void test() {
		adding add = new adding();
		double res =add.add(-3,-6);
		Assert.assertTrue(res<0);
		
	}

}
