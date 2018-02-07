/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import models.Property;

/**
 * @author michealdunne14
 *
 */
public class PropertyTest {
	private Property prop1;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		prop1 = new Property("Owning", 5, 5, 10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	/**
	 * Test method for {@link models.Property#toString()}.
	 */
	@Test
	public final void testToString() {
		assertTrue(prop1.toString().contains("Owning"));
	}

	/**
	 * Test method for {@link models.Property#propertyToString()}.
	 */
	@Test
	public final void testPropertyToString() {
		assertTrue(prop1.toString().contains("Owning"));
	}



	/**
	 * Test method for {@link models.Property#getmAddressProperty()}.
	 */
	@Test
	public final void testGetmAddressProperty() {
		Assert.assertEquals(prop1.getmAddressProperty(), "Owning");
	}

	/**
	 * Test method for {@link models.Property#setmAddressProperty(java.lang.String)}.
	 */
	@Test
	public final void testSetmAddressProperty() {
		String a = "house";
		prop1.setmAddressProperty("house");
		String value = prop1.getmAddressProperty();
		Assert.assertEquals(value,a);
		
	}

	/**
	 * Test method for {@link models.Property#getmDistanceProperty()}.
	 */
	@Test
	public final void testGetmDistanceProperty() {
		Assert.assertEquals(prop1.getmDistanceProperty(), 5.1,0.1);
	}

	/**
	 * Test method for {@link models.Property#setmDistanceProperty(double)}.
	 */
	@Test
	public final void testSetmDistanceProperty() {
		double a = 5.1;
		prop1.setmDistanceProperty(5.1);
		double value = prop1.getmDistanceProperty();
		Assert.assertEquals(value,a,.01);
	}

	/**
	 * Test method for {@link models.Property#getmSpacesProperty()}.
	 */
	@Test
	public final void testGetmSpacesProperty() {
		Assert.assertEquals(prop1.getmSpacesProperty(), 5);
	}

	/**
	 * Test method for {@link models.Property#setmSpacesProperty(int)}.
	 */
	@Test
	public final void testSetmSpacesProperty() {
		int a = 5;
		prop1.setmSpacesProperty(5);
		int value = prop1.getmSpacesProperty();
		Assert.assertEquals(value,a);
	}

	/**
	 * Test method for {@link models.Property#getCountProperty()}.
	 */
	@Test
	public final void testGetCountProperty() {
		Assert.assertEquals(prop1.getCountProperty(), 10);
	}

	/**
	 * Test method for {@link models.Property#setCountProperty(int)}.
	 */
	@Test
	public final void testSetCountProperty() {
		int a = 10;
		prop1.setCountProperty(10);
		int value = prop1.getCountProperty();
		Assert.assertEquals(value,a);
	}

}
