/**
 * The Fraction class represents a mathematical fraction, and is defined by a
 * numerator and a denominator.
 * 
 * @author AJ
 */
public class Fraction {
    
    /**
     * Every instance of the Fraction class contains the two fields
     * numerator and denominator.
     */
    private long numerator, denominator;
    
    /**
     * This function is a CONSTRUCTOR.
     * It is called whenever a new Fraction object is created, for example:
     * 
     *   Fraction f = new Fraction(1, 3);
     * 
     * calls this function and creates a new Fraction representing 1 / 3
     * 
     * @param startingNumerator
     * @param startingDenominator 
     */
    public Fraction(long startingNumerator, long startingDenominator) {
        this.numerator = startingNumerator;
        this.denominator = startingDenominator;
    }
    
    /**
     * Returns the value of this Fraction's numerator
     * @return the Fraction's numerator
     */
    public long getNumerator() {
        return this.numerator;
    }
    
    /**
     * Returns the value of this Fraction's denominator
     * @return the Fraction's denominator
     */
    public long getDenominator() {
        return this.denominator;
    }
    
    /**
     * Sets the value of the Fraction's numerator to the provided value
     * @param numerValue the value of the new numerator
     */
    public void setNumerator(long numerValue) {
        this.numerator = numerValue;
    }
    
    /**
     * Sets the value of the Fraction's denominator to the provided value
     * @param denomValue the value of the new denominator
     */
    public void setDenominator(long denomValue) {
        this.numerator = denomValue;
    }
    
    /**
     * Returns a maximally simplified version of this Fraction
     * @return the simplified Fraction
     */
    public Fraction getSimplified() {
        //TODO: Complete this method
        return null;
    }    
    
    /**
     * Returns a Fraction of the result of the sum of this Fraction and f        
     * Specifically: this + f
     * 
     * @param f The fraction to sum with this
     * @return the sum result
     */
    public Fraction add(Fraction f) {
        // TODO: Complete this function
        return null;
    }
    
    /**
     * Returns a Fraction of the result of the difference of this Fraction and f
     * Specifically: this - f
     * 
     * @param f The fraction to subtract from this
     * @return the result of the difference
     */
    public Fraction subtract(Fraction f) {
        // TODO: Complete this function
        return null;
    }
    
    /**
     * Returns a Fraction of the result of the product of this Fraction and f
     * Specifically: this * f
     * 
     * @param f The fraction to multiply from this
     * @return the result of the product
     */
    public Fraction multiply(Fraction f) {
        // TODO: Complete this function
        return null;
    }
    
    /**
     * Returns a Fraction of the result of the quotient of this Fraction and f
     * Specifically: this / f
     * 
     * @param f The fraction to divide this by
     * @return the result of the quotient
     */
    public Fraction divide(Fraction f) {
        // TODO: Complete this function        
        return null;
    }
    
    @Override
    public String toString() {
        return this.getNumerator() + " / " + this.getDenominator();
    }
    
    /**
     * Determines if this Fraction and f are equivalent fractions
     * @param f the fraction to compare
     * @return true if the two fractions are equivalent
     */
    public boolean equals(Fraction f) {
        // TODO: Complete this function
        return false;
    }
}
