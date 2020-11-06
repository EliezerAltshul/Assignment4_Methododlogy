package ealtshul;

public class MockRandomizer implements IRandomValueGenerator{
	//for the mock object return the median value
	
	@Override
	public int nextInt(int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		return lowerBound+upperBound/2;
	}
	
	@Override
	public double nextDouble(int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		return lowerBound+upperBound/2;
	}

}
