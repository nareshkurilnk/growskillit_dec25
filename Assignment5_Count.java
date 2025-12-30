package day3;

public class Assignment5_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345678;
        int count = 0;
        while(num>0)
        {
        	num=num/10;
        	count++;
        }
        System.out.println("Number of digits: " + count);

	}

}
