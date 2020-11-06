package ealtshul;

public class MockRandomizer implements IRandomValueGenerator{
	int nextInt = 0;
	double nextDouble = 0;
	
	@Override
	public int nextInt(int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		return nextInt;
	}
	
	@Override
	public double nextDouble(int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		return nextDouble;
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
		return nextInt(max, 0);
	}

	@Override
	public double nextDouble(int max) {
		// TODO Auto-generated method stub
		return nextDouble(max, 0);
	}

}
