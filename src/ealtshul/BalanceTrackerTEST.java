package ealtshul;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.Before;
import org.junit.jupiter.api.Test;

public class BalanceTrackerTEST {
	private IRandomValueGenerator random;
	private BalanceTracker tracker;
	
	@Before
    public void init() {
    	random = new MockRandomizer();
    	tracker = new BalanceTracker(100, random);
    }
	
	
	/*@Test(expected = IncorrectProbability.class) 
	public void TestIncorrectProbabilityInputForBetOnProbabilityMethod() throws IncorrectProbability {
		tracker.betOnProbability(100, 0);
    }*/
	
	
	@Test
	public void TestCanBetMethodFalse() {
		assertFalse(tracker.canBet(200));
	}
	
	@Test
	public void TestCanBetMethodTrue() {
		assertTrue(tracker.canBet(5));
	}
	
	@Test
	public void TestBetonNumberMethodSuccess() {
		random.setNextInt(5);
		assertEquals(tracker.betOnANumber(50, 0, 10, 5), 500, 10);
	}
	
	@Test
	public void TestBetonNumberMethodFail() {
		random.setNextInt(4);
		assertEquals(tracker.betOnANumber(50, 0, 10, 5), -500, 10);
	}
	
	
	@Test
	public void TestBetonProbabilityMethodSuccess() throws IncorrectProbability {
		random.setNextDouble(.2);
		assertEquals(tracker.betOnProbability(100, .3), 233, 10);
	}
	
	@Test
	public void TestBetonProbabilityMethodFail() throws IncorrectProbability {
		random.setNextDouble(.5);
		assertEquals(tracker.betOnProbability(100, .3), -233, 10);
	}

}
