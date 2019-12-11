package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stack.Symbol;

/** TDD for symbols for the standard calculator.
 * @author zfac237
 *
 */
public class TestStandardSymbols {

  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void addSymbolTest() { //TEST 48  
    StandardSymbols add = new StandardSymbols();
    Symbol sym = add.selector("+");
    assertEquals("symbol returned was not '+'", "+", sym);
  }

}
