package day3;

public class Assignment5_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
	}

}
