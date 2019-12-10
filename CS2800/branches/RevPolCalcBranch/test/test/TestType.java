package test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import stack.Type;

/** TDD for Type.java
 * @author zfac237
 *
 */
public class TestType {

  /** Checks if the Type enumerator objects are being created.
   * The test allows for the creation of the Type objects SYMBOL,NUMBER,INVALID,STRING.
   */
  @Test
  public void test() { //TEST 3 - Constructor
    assertNotNull("Type.SYMBOL could not be created",Type.SYMBOL);
    assertNotNull("Type.NUMBER could not be created",Type.NUMBER);
    assertNotNull("Type.INVALID could not be created",Type.INVALID);
    assertNotNull("Type.STRING could not be created",Type.STRING);
  }
  
  /**Checks if the toString() method creates matching strings to the Type enumerator object.
   * The test allows for the creation of a getter and a toString() method to pass through.
   */
  @Test
  public void testString() { //TEST 4 - toString(), getType()
    assertEquals("String value 'SYMBOL' incorrect by toString", "SYMBOL", Type.SYMBOL.toString());
    assertEquals("String value 'NUMBER' incorrect by toString","NUMBER", Type.NUMBER.toString());
    assertEquals("String value 'INVALID' incorrect by toString","INVALID", Type.INVALID.toString());
    assertEquals("String value 'STRING' incorrect by toString","STRING", Type.STRING.toString());
  }
}
