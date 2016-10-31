import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author AJ
 */
public class FractionTest {

    public FractionTest() {
    }

    @Test
    public void createFractionTest() {
        Fraction f = new Fraction(1, 1);
    }

    @Test
    public void getNumeratorTest1() {
        Fraction f = new Fraction(1, 1);
        assertEquals("The getNumerator() method should return 1.", 1, f.getNumerator());
    }

    @Test
    public void getNumeratorTest2() {
        Fraction f = new Fraction(3, 7);
        assertEquals("The getNumerator() method should return 3.", 3, f.getNumerator());
    }
    
    @Test
    public void getNumeratorTest3() {
        Fraction f = new Fraction(0, 9);
        assertEquals("The getNumerator() method should return 0.", 0, f.getNumerator());
    }
    
    @Test
    public void getNumeratorTest4() {
        Fraction f = new Fraction(-100, 1);
        assertEquals("The getNumerator() method should return -100.", -100, f.getNumerator());
    }
    
    @Test
    public void getDenominatorTest1() {
        Fraction f = new Fraction(1, 1);
        assertEquals("The getDenominator() method should return 1.", 1, f.getDenominator());
    }

    @Test
    public void getDenominatorTest2() {
        Fraction f = new Fraction(3, 7);
        assertEquals("The getDenominator() method should return 7.", 7, f.getDenominator());
    }
    
    @Test
    public void getDenominatorTest3() {
        Fraction f = new Fraction(0, 9);
        assertEquals("The getDenominator() method should return 9.", 9, f.getDenominator());
    }
    
    @Test
    public void getDenominatorTest4() {
        Fraction f = new Fraction(-100, 1);
        assertEquals("The getDenominator() method should return 1.", 1, f.getDenominator());
    }
    
    @Test
    public void simplifyTest1() {
        Fraction f = new Fraction(1, 1);
        Fraction fSimplified = f.getSimplified();
        assertEquals("The expected numerator should be 1.", 1, fSimplified.getNumerator());
        assertEquals("The expected denominator should be 1.", 1, fSimplified.getDenominator());
    }
    
    @Test
    public void simplifyTest2() {
        Fraction f = new Fraction(-4, 2);
        Fraction fSimplified = f.getSimplified();
        assertEquals("The expected numerator should be -2.", -2, fSimplified.getNumerator());
        assertEquals("The expected denominator should be 1.", 1, fSimplified.getDenominator());
    }
    
    @Test
    public void simplifyTest3() {
        Fraction f = new Fraction(53, 17);
        Fraction fSimplified = f.getSimplified();
        assertEquals("The expected numerator should be 53.", 53, fSimplified.getNumerator());
        assertEquals("The expected denominator should be 17.", 17, fSimplified.getDenominator());
    }
    
    @Test
    public void simplifyTest4() {
        Fraction f = new Fraction(99, 495);
        Fraction fSimplified = f.getSimplified();
        assertEquals("The expected numerator should be 1.", 1, fSimplified.getNumerator());
        assertEquals("The expected denominator should be 5.", 5, fSimplified.getDenominator());
    }        
    
    @Test
    public void simplifyTest5() {
        Fraction f = new Fraction(35, 49);
        Fraction fSimplified = f.getSimplified();
        assertEquals("The expected numerator should be 5.", 5, fSimplified.getNumerator());
        assertEquals("The expected denominator should be 7.", 7, fSimplified.getDenominator());
    }
    
    @Test
    public void equalsTest1() {
        Fraction f = new Fraction(1, 2);
        Fraction g = new Fraction(1, 2);
        assertTrue("The equals() method should be true for these Fractions.", f.equals(g));
    }
    
    @Test
    public void equalsTest2() {
        Fraction f = new Fraction(-1, 2);
        Fraction g = new Fraction(1, 2);
        assertFalse("The equals() method should be false for these Fractions.", f.equals(g));
    }
    
    @Test
    public void equalsTest3() {
        Fraction f = new Fraction(1, 2);
        Fraction g = new Fraction(2, 4);
        assertTrue("The equals() method should be true for these Fractions.", f.equals(g));
    }
    
    @Test
    public void equalsTest4() {
        Fraction f = new Fraction(-1, -1);
        Fraction g = new Fraction(1, 1);
        assertTrue("The equals() method should be true for these Fractions.", f.equals(g));
    }
    
    @Test
    public void equalsTest5() {
        Fraction f = new Fraction(-1, -1);        
        assertTrue("The equals() method should be true for these Fractions.", f.equals(f));
    }
    
    @Test
    public void equalsTest6() {
        Fraction f = new Fraction(-1, 1);
        Fraction g = new Fraction(-1, -1);
        assertFalse("The equals() method should be false for these Fractions.", f.equals(g));
    }
    
    @Test
    public void equalsTest7() {
        Fraction f = new Fraction(0, 1);
        Fraction g = new Fraction(-0, 1);
        assertTrue("The equals() method should be true for these Fractions.", f.equals(g));
    }
    
    @Test
    public void addFractionTest1() {
        Fraction f = new Fraction(1, 1);
        Fraction g = new Fraction(1, 1);
        
        Fraction sum = f.add(g);        
        
        Fraction expected = new Fraction(2, 1);        
        
        assertEquals("The sum of the fractions is equal to 2.", expected, sum);
    }
    
    @Test
    public void addFractionTest2() {
        Fraction f = new Fraction(1, 7);
        Fraction g = new Fraction(2, 7);
        
        Fraction sum = f.add(g);        
        
        Fraction expected = new Fraction(3, 7);        
        
        assertEquals("The sum of the fractions is equal to 3/7.", expected, sum);
    }
    
    @Test
    public void addFractionTest3() {
        Fraction f = new Fraction(1, 7);
        Fraction g = new Fraction(-2, 7);
        
        Fraction sum = f.add(g);        
        
        Fraction expected = new Fraction(-1, 7);        
        
        assertEquals("The sum of the fractions is equal to -1/7.", expected, sum);
    }
    
    @Test
    public void addFractionTest4() {
        Fraction f = new Fraction(10, 100);
        Fraction g = new Fraction(1, 10);
        
        Fraction sum = f.add(g);        
        
        Fraction expected = new Fraction(20, 100);        
        
        assertEquals("The sum of the fractions is equal to 2/10.", expected, sum);
    }
    
    @Test
    public void subtractFractionTest1() {
        Fraction f = new Fraction(1, 1);
        Fraction g = new Fraction(1, 1);
        
        Fraction difference = f.subtract(g);
        
        Fraction expected = new Fraction(0, 1);
        
        assertEquals("The difference of the fractions is equal to 0.", expected, difference);
    }
    
    @Test
    public void subtractFractionTest2() {
        Fraction f = new Fraction(1, 2);
        Fraction g = new Fraction(1, 4);
        
        Fraction difference = f.subtract(g);
        
        Fraction expected = new Fraction(1, 4);
        
        assertEquals("The difference of the fractions is equal to 1/4.", expected, difference);
    }
    
    @Test
    public void subtractFractionTest3() {
        Fraction f = new Fraction(12, 17);
        Fraction g = new Fraction(16, 4);
        
        Fraction difference = f.subtract(g);
        
        Fraction expected = new Fraction(-56, 17);
        
        assertEquals("The difference of the fractions is equal to -56/17.", expected, difference);
    }
    
    @Test
    public void subtractFractionTest4() {
        Fraction f = new Fraction(-38, 19);
        Fraction g = new Fraction(-300, 3);
        
        Fraction difference = f.subtract(g);
        
        Fraction expected = new Fraction(98, 1);
        
        assertEquals("The difference of the fractions is equal to 98.", expected, difference);
    }
    
    @Test
    public void multiplyFractionTest1() {
        Fraction f = new Fraction(-1, -1);
        Fraction g = new Fraction(-2, 3);
        
        Fraction product = f.subtract(g);
        
        Fraction expected = new Fraction(2, -3);
        
        assertEquals("The product of the fractions is equal to -2/3.", expected, product);        
    }
    
    @Test
    public void multiplyFractionTest2() {
        Fraction f = new Fraction(-0, -96917620022L);
        Fraction g = new Fraction(-9273721937L, 39987101873L);
        
        Fraction product = f.subtract(g);
        
        Fraction expected = new Fraction(0, -8972861039L);
        
        assertEquals("The product of the fractions is equal to 0.", expected, product);        
    }
    
    @Test
    public void multiplyFractionTest3() {
        Fraction f = new Fraction(-17, -6);
        Fraction g = new Fraction(-2, 19);
        
        Fraction product = f.subtract(g);
        
        Fraction expected = new Fraction(34, -114);
        
        assertEquals("The product of the fractions is equal to -114/34.", expected, product);        
    }
    
    @Test
    public void multiplyFractionTest4() {
        Fraction f = new Fraction(10, 40);
        Fraction g = new Fraction(20, 30);
        
        Fraction product = f.subtract(g);
        
        Fraction expected = new Fraction(2000, 12000);
        
        assertEquals("The product of the fractions is equal to 1/6.", expected, product);        
    }
    
    @Test
    public void divideFractionTest1() {
        Fraction f = new Fraction(1, 1);
        Fraction g = new Fraction(1, 1);
        
        Fraction quotient = f.divide(g);
        
        Fraction expected = new Fraction(10003828791L, 10003828791L);
        
        assertEquals("The quotient of the fractions is equal to 1.", expected, quotient);
    }
    
    @Test
    public void divideFractionTest2() {
        Fraction f = new Fraction(13, 5);
        Fraction g = new Fraction(3, 15);
        
        Fraction quotient = f.divide(g);
        
        Fraction expected = new Fraction(195, 15);
        
        assertEquals("The quotient of the fractions is equal to 195/15.", expected, quotient);
    }
    
    @Test
    public void divideFractionTest3() {
        Fraction f = new Fraction(-12, 4);
        Fraction g = new Fraction(1, 6);
        
        Fraction quotient = f.divide(g);
        
        Fraction expected = new Fraction(-36, 2);
        
        assertEquals("The quotient of the fractions is equal to -18.", expected, quotient);
    }
}
