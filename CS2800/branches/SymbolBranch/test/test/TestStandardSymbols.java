package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stack.Symbol;
import standardcalc.StandardSymbols;

/** TDD for symbols for the standard calculator.
 * @author zfac237
 *
 */
public class TestStandardSymbols {

  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void addSymbolTest() { //TEST 48  - test to see if plus is returned as symbol.
    StandardSymbols add = new StandardSymbols();
    Symbol sym = add.selector("+");
    assertEquals("symbol returned was not '+'", Symbol.PLUS, sym);
  }
  
  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void minusSymbolTest() { //TEST 49 - test to see if plus is returned as symbol.
    StandardSymbols add = new StandardSymbols();
    Symbol sym = add.selector("+");
    assertEquals("symbol returned was not '+'", Symbol.PLUS, sym);
  }
  
  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void divideSymbolTest() { //TEST 50 - test to see if plus is returned as symbol.
    StandardSymbols add = new StandardSymbols();
    Symbol sym = add.selector("+");
    assertEquals("symbol returned was not '+'", Symbol.PLUS, sym);
  }
  
  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void timeSymbolTest() { //TEST 51 - test to see if plus is returned as symbol.
    StandardSymbols add = new StandardSymbols();
    Symbol sym = add.selector("+");
    assertEquals("symbol returned was not '+'", Symbol.PLUS, sym);
  }
  
  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void riBracketSymbolTest() { //TEST 52 - test to see if plus is returned as symbol.
    StandardSymbols add = new StandardSymbols();
    Symbol sym = add.selector("+");
    assertEquals("symbol returned was not '+'", Symbol.PLUS, sym);
  }
  
  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void leBracketSymbolTest() { //TEST 53 - test to see if plus is returned as symbol. 
    StandardSymbols add = new StandardSymbols();
    Symbol sym = add.selector("+");
    assertEquals("symbol returned was not '+'", Symbol.PLUS, sym);
  }

}
