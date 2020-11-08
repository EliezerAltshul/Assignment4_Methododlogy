package ealtshul;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BalanceTrackerTEST {
	private IRandomValueGenerator random;
	private BalanceTracker tracker;

	
	@Before
    public void init() { 
    	random = new MockRandomizer();
    	tracker = new BalanceTracker(100, random);
    }
	
	
	@Test(expected = IncorrectProbability.class) 
	public void TestIncorrectProbabilityInputForBetOnProbabilityMethod() throws IncorrectProbability {
		tracker.addMoney(1000);
		tracker.betOnProbability(100, -.1);
    }
	
	
	@Test 
	public void TestCanBetMethodFalse() {
		tracker.addMoney(1000);
		assertFalse(tracker.canBet(2000));
	}
	
	@Test
	public void TestCanBetMethodTrue() {
		tracker.addMoney(1000);
		assertTrue(tracker.canBet(50));
	}
	
	@Test
	public void TestBetonNumberMethodSuccess() {
		tracker.addMoney(1000);
		random.setNextInt(5);
		assertEquals(tracker.betOnANumber(50, 0, 10, 5), 500, 10);
	}
	
	@Test
	public void TestBetonNumberMethodFail() {
		tracker.addMoney(1000);
		random.setNextInt(4);
		assertEquals(tracker.betOnANumber(50, 0, 10, 5), -50, 10);
	}
	
	@Test
	public void TestBetonNumberMethodWhenCantPlaceBet() {
		tracker.addMoney(1000);
		random.setNextInt(4);
		assertEquals(tracker.betOnANumber(50000, 0, 10, 5), 0, 10);
	}
	
	
	@Test
	public void TestBetonProbabilityMethodSuccess() throws IncorrectProbability {
		tracker.addMoney(1000);
		random.setNextDouble(.2);
		assertEquals(tracker.betOnProbability(100, .3), 233, 10);
	}
	
	@Test
	public void TestBetonProbabilityMethodFail() throws IncorrectProbability {
		tracker.addMoney(1000);
		random.setNextDouble(.5);
		assertEquals(tracker.betOnProbability(100, .3), -100, 10);
	}
	
	@Test
	public void TestBetonProbabilityMethodWhenCantPlaceBet() throws IncorrectProbability{
		tracker.addMoney(1000);
		random.setNextDouble(.5);
		assertEquals(tracker.betOnProbability(100000, .3), 0, 10);
	}

}
