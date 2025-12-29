package day3;

public class Assignment5_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345678;
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
           int tempNumber = number;
            while (tempNumber != 0) {
                tempNumber /= 10;
                count++;
            }
            }
        System.out.println("Number of digits: " + count);

	}

}
