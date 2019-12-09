package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import stack.BadType;

import stack.Entry;

import stack.Symbol;

import stack.Type;

/** TDD for TestEntry.java
 * @author zfac237
 *
 */
public class TestEntry {

  /** Creates a entry object of Symbol and checks if it can be returned using the getSymbol().
   * The test allows for constructing and getting a symbol value.
   */
  @Test
  public void symValueTest() { //TEST 5 - Symbol entry constructor, getSymbol()
    Entry symbolEntry = new Entry(Symbol.PLUS);
    assertEquals(
        "Symbol value '+' could not be found for the enum DIVIDE using the getSymbol() method", "+",
        String.valueOf(symbolEntry.getSymbol()));
  }

  /** Creates a entry object of Float and checks if it can be returned using the getFloat() method.
   * The test allows for constructing and getting a float value.
   */
  @Test
  public void floatValueTest() { //TEST 6 - Float entry constructor, getFloat()
    Entry floatEntry = new Entry(43.2f);
    assertEquals("float value of 43.2f could not be found using the getFloat() method", 43.2f,
        floatEntry.getFloat(), 0.0f);
  }

  /** Creates a entry object of Type and checks if it can be returned using the getType() method.
   * The test allows for constructing and getting a type value.
   */
  @Test
  public void typValueTest() { //TEST 7 - Type entry constructor, getType()
    Entry typeEntry = new Entry(Type.INVALID);
    assertEquals("type value INVALID could not be found using the getType() method", "INVALID",
        String.valueOf(typeEntry.getType()));
  }

  /** Creates a entry object of String and checks if it can be returned using the getString().
   * The test allows for constructing and getting a string value.
   */
  @Test
  public void strValueTest() { //TEST 8 - String entry constructor, getString()
    Entry stringEntry = new Entry("test string");
    assertEquals("test string could not be found using the getString() method", "test string",
        stringEntry.getString());
  }

  /** Creates a entry object of Symbol and retrieves the entry using toString() method.
   * The test allows for the creating of a toString() method to display the entry.
   */
  @Test
  public void toStringSymbolTest() { //TEST 9 - Symbol entry constructor, toString().
    Entry toStringValueSym = new Entry(Symbol.PLUS);
    assertEquals("toString method did not return correct value for Symbol.PLUS", "+",
        toStringValueSym.toString());
  }

  /** Creates a entry object of Float and retrieves the entry using toString() method.
   * The test allows for the creating of a toString() method to display the entry.
   */
  @Test
  public void toStringFloatTest() { //TEST 10 - Float entry constructor, toString().
    Entry toStringValueFloat = new Entry(43.2f);
    assertEquals("toString method did not return 43.2", "43.2", 
        toStringValueFloat.toString());
  }

  /** Creates a entry object of Type and retrieves the entry using toString() method.
   * The test allows for the creating of a toString() method to display the entry.
   */
  @Test
  public void toStringTypeTest() { //TEST 11 - Type entry constructor, toString().
    Entry toStringValueType = new Entry(Type.INVALID);
    assertEquals("toString() method did not return correct value for Type.INVALID","INVALID", 
        toStringValueType.toString());
  }

  /** Creates a entry object of String and retrieves the entry using toString() method.
   * The test allows for the creating of a toString() method to display the entry.
   */
  @Test
  public void toStringTest() { //TEST 12 - String entry constructor, toString().
    Entry toStringValue = new Entry("test string");
    assertEquals("toString() method did not return test string", 
        "test string", toStringValue.toString());
  }

  /** Creates entry object of Float and tried to return it using the getString() method.
   *  The test is for the creation of a BadType and thrown when Float is paired with String.
   */
  @Test(expected = BadType.class) 
  public void testFloatGetterException() { //TEST 14 - Float entry constructor with getString().
    Entry floatException = new Entry(23.f);
    floatException.getString();
  }

  /** Creates entry object of Symbol and tried to return it using the getType() method.
   *  The test is for the creation of a BadType and thrown when Symbol is paired with Type.
   */
  @Test(expected = BadType.class)
  public void testSymbolGetterException() { //TEST 15 - Symbol entry constructor with getType().
    Entry symbolException = new Entry(Symbol.PLUS);
    symbolException.getType();
  }

  /** Creates entry object of Type and tried to return it using the getSymbol() method.
   *  The test is for the creation of a BadType and thrown when Type is paired with Symbol.
   */
  @Test(expected = BadType.class)
  public void testTypeGetterException() { //TEST 16 - Type entry constructor with getSymbol.
    Entry typeException = new Entry(Type.INVALID);
    typeException.getSymbol();
  }

  /** Creates entry object of String and tried to return it using the getFloat() method.
   *  The test is for the creation of a BadType and thrown when String is paired with Float.
   */
  @Test(expected = BadType.class)
  public void testStringGetterException() { //TEST 17 - String entry constructor with getFloat().
    Entry stringException = new Entry("string test");
    stringException.getFloat();
  }
}
