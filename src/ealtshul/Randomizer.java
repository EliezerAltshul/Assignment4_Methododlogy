package ealtshul;

import java.util.*;

public class Randomizer implements IRandomValueGenerator{
	int nextInt = 0;
	double nextDouble = 0;
	
	@Override
	public int nextInt(int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		int random = 0;
		if(nextInt != 0) {
			random = nextInt;
			nextInt = 0;
		}
		else random = new Random().nextInt(upperBound) + lowerBound;
		return random;
	}

	@Override
	public double nextDouble(int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		double random = 0;
		if(nextDouble != 0) {
			random = nextDouble;
			nextDouble = 0;
		}
		else random =  lowerBound + (upperBound - lowerBound) * new Random().nextDouble();
		return random;
	}

	@Override
	public void setNextInt(int num) {
		// TODO Auto-generated method stub
		nextInt = num;
	}

	@Override
	public void setNextDouble(double num) {
		// TODO Auto-generated method stub
		nextDouble = num;
	}

	@Override
	public int nextInt(int max) {
		// TODO Auto-generated method stub
		return nextInt(0, max);
	}


	@Override
	public double nextDouble(int max) {
		// TODO Auto-generated method stub
		return nextDouble(0, max);
	}
	

}
