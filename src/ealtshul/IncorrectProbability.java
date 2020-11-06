package ealtshul;

public class IncorrectProbability extends Exception {
	public IncorrectProbability()
	{
	    super("Your probability is either negative or above 1");
	}
}
