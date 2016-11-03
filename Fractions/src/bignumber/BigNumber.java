package bignumber;

/**
 * The BigNumber class is nearly identical to BigInteger.
 * 
 * Any arbitrarily large integer can be stored in a BigNumber, and
 * it will not lose accuracy (like a double) or overflow (like a long)
 * 
 * @author AJ
 *
 */
public class BigNumber {

	/****** Instance variables go here *******/
	// TODO: Add necessary variable(s) to represent the value of a BigNumber
	
	
	/**
	 * This constructor takes a String value of an Integer
	 * and creates a new BigNumber with this value
	 * 
	 * @param startValue - a String that can be parsed as an integer
	 */
	public BigNumber(String startValue) {
		// TODO: Complete this constructor
		
	}
	
	/**
	 * This constructor takes a long and creates a new BigNumber with this value
	 * 
	 * @param startValue - a long that will be the starting value 
	 */
	public BigNumber(long startValue) {
		// TODO: Complete this constructor
		
	}
	
	/**
	 * This constructor takes an int and creates a new BigNumber with this value
	 * 
	 * @param startValue - an int that will be the starting value
	 */
	public BigNumber(int startValue) {
		// TODO: Complete this constructor
		
	}
	
	/**
	 * Adds this BigNumber and num (this + num)
	 * 
	 * @param num
	 * @return - the sum of (this + num)
	 */
	public BigNumber add(BigNumber num) {
		// TODO: Complete this method
		return null;
	}
	
	/**
	 * Subtracts num from this BigNumber (this - num)
	 * 
	 * @param num
	 * @return - the difference of (this - num)
	 */
	public BigNumber subtract(BigNumber num) {
		// TODO: Complete this method
		return null;
	}
	
	/**
	 * Multiplies this BigNumber by num (this * num)
	 * 
	 * @param num
	 * @return - the product of (this * num)
	 */
	public BigNumber multiply(BigNumber num) {
		// TODO: Complete this method
		return null;
	}
	
	/**
	 * Divides this BigNumber by num (this / num)
	 *  
	 * @param num
	 * @return - the quotient of (this / num)
	 */
	public BigNumber divide(BigNumber num) {
		// TODO: Complete this method
		return null;
	}
	
	/**
	 * Converts this BigNumber to a negative version of itself
	 */
	public void negate() {
		// TODO: Complete this method
	}
	
	@Override
	/**
	 * Returns a String representation of this BigNumber
	 */
	public String toString() {
		// TODO: Complete this method
		return "TODO: COMPLETE THIS METHOD";
	}
	
	@Override
	/**
	 * Returns true if the two BigNumbers are equivalent to one another
	 */
	public boolean equals(Object o) {
		// Convert the Object o to a BigNumber in order to compare them.
		BigNumber num = (BigNumber) o;
		
		// TODO: Complete this method.
		return false;
	}
}
