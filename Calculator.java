public class Calculator{

public int adding(int a, int b){
	System.out.println("Adding two numbers: "+a+" and "+b);
	int result = a+b; //local variable
	return result;
}

public double adding(double a, double b){
	System.out.println("Adding two numbers: "+a+" and "+b);
	double result = a+b; //local variable
	return result;
}

public int adding(int a, int b, int c){
	System.out.println("Adding three numbers: "+a+", "+b+" and "+c);
	int result = a+b+c;
	return result;
}

public int adding(int a, int b, int c, int d){
	System.out.println("Adding four numbers: "+a+", "+b+", "+c+" and "+d);
	int result = a+b+c+d;
	return result;
}

}