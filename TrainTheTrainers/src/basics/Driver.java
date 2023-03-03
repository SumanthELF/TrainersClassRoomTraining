package basics;

public class Driver implements Demo{

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(1,2,3,4,5,6));
		System.out.println(cal.add(2,4));
		System.out.println(cal.add(1,2,3,4,5,6,7,8,9));
		
		
		
		
		
		
		System.out.println(cal.add(1,2,3,4,5,6));
		System.out.println(cal.add(2,4));
		System.out.println(cal.add(1,2,3,4,5,6,7,8,9));
	}
}
