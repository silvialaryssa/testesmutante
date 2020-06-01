package palindromo.palindromo;

import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromoTest {

	

	@Test
	public void whenPalindrom_thenAccept() {
	    Palindromo palindromeTester = new Palindromo();
	    assertTrue(palindromeTester.isPalindrome("noon"));
	}
	
	@Test
	public void whenNoPalindrom_thenReject() {
	    Palindromo palindromeTester = new Palindromo();
	    assertFalse(palindromeTester.isPalindrome("box"));
	}
	
	//@Test
	//public void whenNoPalindrom_thenReject1() {
	   // Palindromo palindromeTester = new Palindromo();
	   // assertFalse(palindromeTester.isPalindrome("noen"));
	//}
}
