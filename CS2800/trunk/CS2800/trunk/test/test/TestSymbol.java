package test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import stack.Symbol;

/** TDD for Symbol.java
 * @author zfac237
 *
 */
public class TestSymbol {

  /** Checks if the Symbol enumerator objects are being created.
   * The test allows for the creation of the Symbol objects *,/,+,-,N,(,).
   */
  @Test
  public void test() { // TEST 1 - Constructor
    assertNotNull("TIMES could not be created",Symbol.TIMES);
    assertNotNull("DIVIDE could not be created",Symbol.DIVIDE);
    assertNotNull("PLUS could not be created",Symbol.PLUS);
    assertNotNull("MINUS could not be created",Symbol.MINUS);
    assertNotNull("INVALID could not be created",Symbol.INVALID);
    assertNotNull("LEFT_BRACKET could not be created",Symbol.LEFT_BRACKET);
    assertNotNull("RIGHT_BRACKET could not be created",Symbol.RIGHT_BRACKET);
  }

  /**Checks if the toString() method creates matching strings to the Symbol enumerator object.
   * The test allows for the creation of a getter and a toString() method to pass through.
   */
  @Test
  public void testValues() { // TEST 2 - toString() and getSymbol()
    assertEquals("The string value '*' is not returned by toString","*", Symbol.TIMES.toString());
    assertEquals("The string value '/' is not returned by toString","/", Symbol.DIVIDE.toString());
    assertEquals("The string value '+' is not returned by toString","+", Symbol.PLUS.toString());
    assertEquals("The string value '-' is not returned by toString","-", Symbol.MINUS.toString());
    assertEquals("The string value 'N' is not returned by toString","N", Symbol.INVALID.toString());
    assertEquals("String value '(' not returned by toString","(", Symbol.LEFT_BRACKET.toString());
    assertEquals("String value ')' not returned by toString",")", Symbol.RIGHT_BRACKET.toString());

  }

}
