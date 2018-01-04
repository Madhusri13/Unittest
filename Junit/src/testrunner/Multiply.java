package testrunner;

public class Multiply {
int a,b;

public Multiply(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	
}

public int multiplication(){
	return a*b;
}
public int divide(){
	return a/b;
}
	public static void main(String[] args) {
		Multiply obj = new Multiply(2,3);
		Multiply obj1 = new Multiply(3,2);
		System.out.println(obj.multiplication());
		System.out.println(obj1.divide());
		System.out.println("End");
	}

}
