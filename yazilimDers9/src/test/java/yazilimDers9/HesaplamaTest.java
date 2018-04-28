package yazilimDers9;

import org.junit.Assert;

import org.junit.Test;

public class HesaplamaTest {
	@Test 
	public void testTopla25ve14() {
		int gercekSonuc = dersOrnek.topla(25, 14);
		Assert.assertEquals(39,gercekSonuc);
	}

}
