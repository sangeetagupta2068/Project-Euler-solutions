
//Problem 1: Find the sum of all multiples of 3 or 5 below 1000.

public class Calculator {

    public int calculateMultiples(int numberOne, int numberTwo, int limit) {

        int sum = 0,multipleCountForNumberOne = 0, multipleCountForNumberTwo = 0,multipleCountForCommonNumber=0;

        while(multipleCountForNumberOne<limit) {
            sum = sum + multipleCountForNumberOne;
            multipleCountForNumberOne = multipleCountForNumberOne + numberOne;
        }

        while (multipleCountForNumberTwo<limit) {
            sum = sum + multipleCountForNumberTwo;
            multipleCountForNumberTwo = multipleCountForNumberTwo + numberTwo;
        }

        while (multipleCountForCommonNumber<limit){
            sum = sum - multipleCountForCommonNumber;
            multipleCountForCommonNumber = multipleCountForCommonNumber + (numberOne * numberTwo);
        }


        return sum;
    }

    public static void main(String... args) {

        Calculator calculator = new Calculator();
        long startTime = System.currentTimeMillis();
        System.out.println("Sum of multiples of 3 and 5 is: " + calculator.calculateMultiples(3,5,1000));
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
