package ca.bcit.comp1510.lab09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Tas
 * @version 1.0
 *
 */
class ComplexTest {

    /**
     * Tests the equals method.
     */
    @Test
    void testEqualObj() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 1);
        
        boolean result = z1.equals(z2);
        assertEquals(result, false);
    }
    
    /**
     * Tests the reciprocal method.
     */
    @Test
    void testReciprocal() {
        Complex z1 = new Complex(3, 4);
        Complex actual = new Complex(0.12, -0.16);
        Complex expected = z1.reciprocal();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Add method.
     */
    @Test
    void testAdd() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 1);
        Complex actual = new Complex(4, 5);
        Complex expected = z1.add(z2);
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Subtract method.
     */
    @Test
    void testSubtract() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 1);
        Complex actual = new Complex(2, 3);
        Complex expected = z1.subtract(z2);
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Multiply method.
     */
    @Test
    void testMultiply() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 1);
        Complex actual = new Complex(-1, 7);
        Complex expected = z1.multiply(z2);
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Multiply method using only imaginary value.
     */
    @Test
    void testMultiply2() {
        Complex z1 = new Complex(0, 1);
        Complex z2 = new Complex(0, 1);
        Complex actual = new Complex(-1, 0);
        Complex expected = z1.multiply(z2);
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Divide method.
     */
    @Test
    void testDivide() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 1);
        Complex actual = new Complex(3.5, 0.5);
        Complex expected = z1.divide(z2);
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Abs method.
     */
    @Test
    void testAbs() {
        Complex z1 = new Complex(3, 4);
        double actual = 5.0;
        double expected = z1.abs();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Abs method.
     */
    @Test
    void testAbs2() {
        Complex z1 = new Complex(0, 1);
        double actual = 1.0;
        double expected = z1.abs();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Arg method.
     */
    @Test
    void testArg() {
        Complex z1 = new Complex(1, 1);
        double actual = Math.PI / 4.0;
        double expected = z1.arg();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Arg method.
     */
    @Test
    void testArg2() {
        Complex z1 = new Complex(0, 1);
        double actual = Math.PI / 2.0;
        double expected = z1.arg();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Arg method.
     */
    @Test
    void testArg3() {
        Complex z1 = new Complex(-1, 0);
        double actual = Math.PI;
        double expected = z1.arg();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Conjugate method.
     */
    @Test
    void testConjugate() {
        Complex z1 = new Complex(3, 4);
        Complex actual = new Complex(3, -4);
        Complex expected = z1.conjugate();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Exponential (exp) method.
     */
    @Test
    void testExp() {
        Complex z1 = new Complex(3, 4);
        Complex actual = new Complex(-13.128783081462158, -15.200784463067954);
        Complex expected = z1.exp();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the logarithm (log) method.
     */
    @Test
    void testLog() {
        Complex z1 = new Complex(3, 4);
        Complex actual = new Complex(1.6094379124341003, 0.9272952180016122);
        Complex expected = z1.log();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the exponent-logarithm method.
     */
    @Test
    void testExpLog() {
        Complex z1 = new Complex(3, 4);
        Complex actual = new Complex(3.0, 3.999999999999999);
        Complex expected = z1.log().exp();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the logarithm-exponent method.
     */
    @Test
    void testLogExp() {
        Complex z1 = new Complex(3, 4);
        Complex actual = new Complex(3.0, -2.2831853071795867);
        Complex expected = z1.exp().log();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Exponential (exp) method.
     */
    @Test
    void testExp2() {
        Complex z1 = new Complex(1, 1);
        Complex actual = new Complex(1.4686939399158851, 2.2873552871788423);
        Complex expected = z1.exp();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the logarithm (log) method.
     */
    @Test
    void testLog2() {
        Complex z1 = new Complex(1, 1);
        Complex actual = new Complex(0.3465735902799727, 0.7853981633974483);
        Complex expected = z1.log();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the exponent-logarithm method.
     */
    @Test
    void testExpLog2() {
        Complex z1 = new Complex(1, 1);
        Complex actual = new Complex(1.0000000000000002, 1.0);
        Complex expected = z1.log().exp();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the logarithm-exponent method.
     */
    @Test
    void testLogExp2() {
        Complex z1 = new Complex(1, 1);
        Complex actual = new Complex(1.0, 1.0);
        Complex expected = z1.exp().log();
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Exponential (exp) method.
     */
    @Test
    void testExp3() {
        Complex z1 = new Complex(0, Math.PI);
        Complex z2 = new Complex(1, 0);
        Complex actual = new Complex(0, 1.2246467991473532 * Math.pow(10,-16));
        Complex expected = z1.exp().add(z2);
        assertEquals(actual, expected);
    }
    
    /**
     * Tests the Zero reciprocal exception method.
     */
    @Test
    void testException1() {
        
        assertThrows(IllegalArgumentException.class, () -> {
            Complex.ONE.divide(Complex.ZERO);
        });
    }
    
    /**
     * Tests the divide by Zero exception method.
     */
    @Test
    void testException2() {
        
        assertThrows(IllegalArgumentException.class, () -> {
            Complex.ZERO.reciprocal();
        });
    }
    
    
    
    
}
