package ealtshul;

import java.util.*;

public class BalanceTracker {
	private double balance = 0;
	private int minBalance;
	private IRandomValueGenerator random;
	
	//a constructor to set the minBalance and random field
	public BalanceTracker(int minBalance, IRandomValueGenerator random) {
		this.minBalance = minBalance;
		this.random = random;
	}
	
	//a simple getter for the current balance
	public double getCurrentBalance() {
		return 0;
	}
	
	//determines whether a bet can be made
	public boolean canBet(double amnt) {
		return false;
	}
	
	//determines whether a bet can be made
	public void addMoney(double amnt) {
	}
	
	//place a bet on a number
	public double betOnANumber(double amnt, int min, int max, int selectedNumber){
		return 0;
	}
	
	//place a bet on a probability
	public double betOnProbability(double amnt,  double  p) throws IncorrectProbability {
		return 0;
	}

}