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
		return balance;
	}
	
	//determines whether a bet can be made
	public boolean canBet(double amnt) {
		return balance-amnt>minBalance;
	}
	
	//determines whether a bet can be made
	public void addMoney(double amnt) {
		balance += amnt;
	}
	
	//place a bet on a number
	public double betOnANumber(double amnt, int min, int max, int selectedNumber){
		if(!canBet(amnt)) return 0;
		
		int num = random.nextInt(min,  max);
		double prevBalance = balance;
		
		if(selectedNumber != num) balance -= amnt;
		else balance += (max-min) * amnt;
		
		return balance-prevBalance;
	}
	
	//place a bet on a probability
	public double betOnProbability(double amnt,  double  p) throws IncorrectProbability {
		if(!canBet(amnt)) return 0;
		
		double prevBalance = balance;
		if(p < 0 || p > 1) throw new IncorrectProbability();
		if(random.nextDouble(0,1) >= p) balance -= amnt;
		else balance += ((1/p)-1) * amnt;
		
		return balance-prevBalance;
	}

}