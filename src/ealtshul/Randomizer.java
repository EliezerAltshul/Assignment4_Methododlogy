package ealtshul;

import java.util.*;

public class Randomizer implements IRandomValueGenerator{
	
	@Override
	public int nextInt(int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		return new Random().nextInt(upperBound) + lowerBound;
	}

	@Override
	public double nextDouble(int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		return lowerBound + (upperBound - lowerBound) * new Random().nextDouble();
	}
	

}
