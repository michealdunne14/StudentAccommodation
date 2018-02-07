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
import models.Room;

/**
 * @author michealdunne14
 *
 */
public class RoomTest {
	private Room roomTest;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		roomTest = new Room(25, "Yes", 5, 5);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link models.Room#Room(int, java.lang.String, int, int)}.
	 */

	/**
	 * Test method for {@link models.Room#getmLevelRoom()}.
	 */
	@Test
	public final void testGetmLevelRoom() {
		Assert.assertEquals(roomTest.getmLevelRoom(),25);
	}

	/**
	 * Test method for {@link models.Room#setmLevelRoom(int)}.
	 */
	@Test
	public final void testSetmLevelRoom() {
		int a = 2;
		roomTest.setmLevelRoom(2);
		int value = roomTest.getmLevelRoom();
		Assert.assertEquals(value,a);
	}

	/**
	 * Test method for{@link models.Room#setmEnSuiteRoom(java.lang.String)}.
	 */
	@Test
	public final void testSetmEnSuiteRoom() {
		String a = "Yes";
		roomTest.setmEnSuiteRoom("Yes");
		String value = roomTest.getmEnSuiteRoom();
		Assert.assertEquals(value,a);
	}
}
