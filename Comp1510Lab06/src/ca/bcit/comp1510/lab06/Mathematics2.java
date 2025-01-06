package ca.bcit.comp1510.lab06;

import java.util.Random;

/** Mathematics2 - contains various calculations.
 * @author Tas
 * @version 1.0
 */
public class Mathematics2 {

    /** Constant used to calculations.*/
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    /** Constant used for random number.*/
    static final int TEN = 10;    
    
    /** Constant used for random number.*/
    static final int FIFTEEN = 15;
    
    /** Constant used for random number.*/
    static final int ELEVEN = 11;  

    /**
    * Returns the area of the square with the specified edge length.
    *
    * @param edgeLength of the square.
    * @return area as a double
    */
    public double getSquareArea(double edgeLength) {
        double area = Math.pow(edgeLength, 2);
        return area;
    }
    
    /**
    * Returns the sum of the specified values.
    *
    * @param first operand
    * @param second operand
    * @return sum of the operands as a double
    */
    public double add(double first, double second) {
        double sum = first + second;
        return sum;
    }

    /**
    * Returns the product of the specified values.
    *
    * @param first operand
    * @param second operand
    * @return product of the operands as a double
    */
    public double multiply(double first, double second) {
        double product = first * second;
        return product;
    }

    /**
    * Returns the difference of the specified values.
    *
    * @param first operand
    * @param second operand
    * @return difference of the operands as a double
    */
    public double subtract(double first, double second) {
        double difference = first - second;
        return difference;
    }

    /**
    * Returns the quotient of the specified values. If the divisor is zero,
    * returns zero instead of NaN or infinity.
    *
    * @param first operand
    * @param second operand
    * @return quotient of the operands as a double
    */
    public double divide(double first, double second) {
        
        if (second == 0) {
            return 0.0;
        }
        double quotient = first / second;
        return quotient;
    }

    /**
    * Returns the absolute value of the specified integer.
    *
    * @param number to test
    * @return absolute value of number as a integer
    */
    public int absoluteValue(int number) {        
        int absolute = Math.abs(number);
        return absolute;
    }

    /**
    * Returns a random number between 10 and 20 inclusive,
    * but NOT 15.
    * @return random integer number in range [10, 20] excluding 15.
    */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        Random random = new Random();
        int num = random.nextInt(ELEVEN) + TEN;
        if (num == FIFTEEN) {
            return TEN;
        } else {
            return num;
        }
        
    }

    /**
    * Converts the specified number of feet to kilometers.
    * @param feet to convert
    * @return kilometers in the specified number of feet as a double
    */
    public double convertFeetToKilometres(double feet) {
        double kilometers = feet * FOOT_TO_KILOMETRE_RATIO;
        return kilometers;
    }

    /**
    * Returns the sum of the numbers between zero and the
    * first parameter that are divisible by the second
    * number. For example, sumOfProducts(10, 3) will return
    * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
    * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
    * return -2 + -4 + -6 + -8 + -10 = -30.
    * @param bound the upper bound
    * @param divisor the divisor
    * @return sum
    */
    public int sumOfProducts(int bound, int divisor) {
        int sum = 0;
        int count = 1;
        
        if (bound > 0) {
            while (count <= bound) {
                if (count % divisor == 0) {
                    
                    sum += count;
                }
                
                count++;
            }
        } else {
            
            while (count >= bound) {
                if (count % divisor == 0) {
                    
                    sum += count;
                }
                
                count--;
            }
        }
        
        
    
        return sum;
    }
    
    

}

