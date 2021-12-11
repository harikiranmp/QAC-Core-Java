public class CalculatorOpr{

public static void main(String[] args){

System.out.println("Main method started");

Calculator Calculator1 = new Calculator();

int result = Calculator1.adding(1,2);

System.out.println("result= "+result);

Calculator Calculator2 = new Calculator();

double result1 = Calculator2.adding(5.3,2.6);

System.out.println("result= "+result1);

System.out.println("Main method ended");
}

}