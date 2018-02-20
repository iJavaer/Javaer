package JUnit;

public class BasicUnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	 public static int add(int number1, int number2) {
	      return number1 + number2;
	   }
	 
	   public static int sub(int number1, int number2) {
	      return number1 - number2;
	   }
	 
	   public static int mul(int number1, int number2) {
	      return number1 * number2;
	   }
	 
	   // Integer divide. Return a truncated int.
	   public static int divInt(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return number1 / number2;
	   }
	 
	   // Real number divide. Return a double.
	   public static double divReal(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return (double) number1 / number2;
	   }
	   
	   public static Integer addex(int num1, int num2){
		   return num1+num2;	   }
	   
	   public static BasicTestPojo returnPojo(BasicTestPojo obj){
		   return obj;
	   }
	   
	   public static int sumOfPojo(BasicTestPojo obj){
		   int value;
		   value = obj.getNum2() + obj.getNum1();
		   return value;
	   }
}
