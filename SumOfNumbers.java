package sum;


		import java.util.Scanner;

		public class SumOfNumbers {
		    public static void main(String[] args) {
		        int x, y, sum;
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        x = sc.nextInt();

		        System.out.print("Enter the second number: ");
		        y = sc.nextInt();

		        sum = sum(x, y);
		        System.out.println("The sum of the two numbers is: " + sum);
		    }

		    // User-defined method to calculate the sum
		    public static int sum(int a, int b) {
		        return a + b;
		    }

}
