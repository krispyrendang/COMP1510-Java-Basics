/**
 * 
 */
package ca.bcit.comp1510.lab08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



/**
 * @author Tas
 * @version 1.0
 */
class DateTest {
       
    /**
     * Tests the isMonthValid method.
     */
    @Test
    public void testDateMonthValid1() {
        boolean check = Date.isMonthValid(13);
        assertEquals(false, check);
    }
    
    /**
     * Tests the isMonthValid method.
     */
    @Test
    public void testDateMonthValid2() {
        boolean check = Date.isMonthValid(0);
        assertEquals(false, check);
    }
    
    /**
     * Tests the isMonthValid method.
     */
    @Test
    public void testDateMonthValid3() {
        boolean check = Date.isMonthValid(-2);
        assertEquals(false, check);
    }
    
    /**
     * Tests the isLeapYear method.
     */
    @Test
    public void testDateLeapYear1() {
        boolean check = Date.isLeapYear(2000);
        assertEquals(true, check);
    }
    
    /**
     * Tests the isLeapYear method.
     */
    @Test
    public void testDateLeapYear2() {
        boolean check = Date.isLeapYear(1700);
        assertEquals(false, check);
    }
    
    /**
     * Tests the isLeapYear method.
     */
    @Test
    public void testDateLeapYear3() {
        boolean check = Date.isLeapYear(1594);
        assertEquals(false, check);
    }
    
    /**
     * Tests the isYearValid method.
     */
    @Test
    public void testDateYearValid1() {
        boolean check = Date.isYearValid(1582);
        assertEquals(true, check);
    }
    
    /**
     * Tests the isYearValid method.
     */
    @Test
    public void testDateYearValid2() {
        boolean check = Date.isYearValid(1581);
        assertEquals(false, check);
    }
    
    /**
     * Tests the isYearValid method.
     */
    @Test
    public void testDateYearValid3() {
        boolean check = Date.isYearValid(3000);
        assertEquals(false, check);
    }
    
    /**
     * Tests the isYearValid method.
     */
    @Test
    public void testDateYearValid4() {
        boolean check = Date.isYearValid(2999);
        assertEquals(true, check);
    }
    
    /**
     * Tests the daysInMonth method.
     */
    @Test
    public void testDateDaysInMonth1() {
        int check = Date.daysInMonth(2, true);
        assertEquals(29, check);
    }
    
    /**
     * Tests the daysInMonth method.
     */
    @Test
    public void testDateDaysInMonth2() {
        int check = Date.daysInMonth(2, false);
        assertEquals(28, check);
    }
    
    /**
     * Tests the daysInMonth method.
     */
    @Test
    public void testDateDaysInMonth3() {
        int check = Date.daysInMonth(1, true);
        assertEquals(31, check);
    }
    
    /**
     * Tests the daysInMonth method.
     */
    @Test
    public void testDateDaysInMonth4() {
        int check = Date.daysInMonth(12, true);
        assertEquals(31, check);
    }
    
    /**
     * Tests the daysInMonth method.
     */
    @Test
    public void testDateDaysInMonth5() {
        int check = Date.daysInMonth(4, true);
        assertEquals(30, check);
    }
    
    /**
     * Tests the isDateValid method.
     */
    @Test
    public void testDateDateValid1() {
        boolean check = Date.isDateValid(24, 2, 1582);
        assertEquals(true, check);
    }
    
    /**
     * Tests the isDateValid method.
     */
    @Test
    public void testDateDateValid2() {
        boolean check = Date.isDateValid(23, 2, 1582);
        assertEquals(false, check);
    }

}
