public class Day_02 {
	public static void main(String[] args) {

		// Task 1: Declare variables and print their values
		System.out.println("1.");
		String name = "Your Name";
		int age = 20;
		float weight = 70.5f;
		boolean isStudent = true;

		System.out.println("Name - " + name);
		System.out.println("Age - " + age);
		System.out.println("Weight - " + weight);
		System.out.println("Is Student - " + isStudent);
		System.out.println("---------------------------------");

		// Task 2: Convert Celsius to Fahrenheit
		System.out.println("2.");
		double celsius = 25.0;
		double fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
		System.out.println("---------------------------------");

		// Task 3: Swap two variables with and without using a third variable
		System.out.println("3.");
		int a = 5, b = 10;

		// Without using a third variable
		System.out.println("Before Swap (without third variable): a = " + a + ", b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap (without third variable): a = " + a + ", b = " + b);

		// Using a third variable
		int x = 5, y = 10;
		System.out.println("Before Swap (with third variable): x = " + x + ", y = " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After Swap (with third variable): x = " + x + ", y = " + y);
		System.out.println("---------------------------------");

		// Task 4: Implicit and Explicit Casting
		System.out.println("4.");
		// Implicit casting (int to double)
		int intVal = 10;
		double doubleVal = intVal;
		System.out.println("Implicit Casting: int " + intVal + " to double " + doubleVal);

		// Explicit casting (double to int)
		double val = 10.75;
		int intVal2 = (int) val;
		System.out.println("Explicit Casting: double " + val + " to int " + intVal2);
		System.out.println("---------------------------------");

		// Questions for you
		System.out.println();
		System.out.println("Questions for you");
		System.out.println();

		// Question 1: String vs char[] and why String is special
		System.out.println(
				"1. String is immutable, whereas char[] is mutable. String objects are stored in a special memory area called the String Pool.");

		// Question 2: Implicit vs explicit casting for int and double
		System.out.println(
				"2. Java allows implicit casting for int to double because it is a widening conversion, but requires explicit casting for double to int because it is a narrowing conversion.");

		// Question 3: Float vs double
		System.out.println(
				"3. Float has a smaller precision compared to double. Use float when memory is limited, otherwise use double for better precision.");
	}
}
