package basics;

public class Calculator {

	public int add(int...a) {
		int sum=0;
		for(int d : a) {
			sum+=d;
		}
		return sum;
	}

	public void sample(Calculator...calculators) {
		this.add(8,6,6,6);
	}
}
