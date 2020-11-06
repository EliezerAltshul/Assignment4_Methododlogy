package ealtshul;

public interface IRandomValueGenerator {
	void setNextInt(int num);
	void setNextDouble(double num);
	int nextInt(int max);
	int nextInt(int lowerBound, int upperBound);
	double nextDouble(int lowerBound, int upperBound);
	double nextDouble(int max);
	
}
