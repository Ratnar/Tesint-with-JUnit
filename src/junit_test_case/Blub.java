package junit_test_case;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Blub extends TestCase {

	private MerkwuerdigeKlasse mk;

	public Blub() {
		mk = new MerkwuerdigeKlasse();
	}

	@Test
	public void testMergeSort() {
		int[] list = { 1, 2, 3, 4, 5, 7, 9 };
		int mergseSortlist[] = mk.sort(0, 6);
		for (int i = 0; i < mergseSortlist.length; i++) {
			Assert.assertSame(mergseSortlist[i], list[i]);
		}
	}
	
	@Test
	public void testNull(){
		Assert.assertEquals(mk.returnNull(), null);
	}

	@Test
	public void testHello(){
		Assert.assertSame(mk.returnHello(), "Hello");
	}
	
	@Test
	public void testTrue(){
		Assert.assertEquals(true, true);
	}
	
	public static void main(String args[]) {
		new Blub();
	}
}
