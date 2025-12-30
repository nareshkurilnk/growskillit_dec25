package day3;

public class Assignment5_FactorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12;

	    System.out.print("Factors of " + number + " are: ");

	    for (int i = 1; i <= number; ++i) {
	      if (number % i == 0) {
	        System.out.print(i + " ");
	      }
	    }

	}

}
