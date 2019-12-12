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
    StandardSymbols minus = new StandardSymbols();
    Symbol sym = minus.selector("-");
    assertEquals("symbol returned was not '-'", Symbol.MINUS, sym);
  }
  
  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void divideSymbolTest() { //TEST 50 - test to see if plus is returned as symbol.
    StandardSymbols divide = new StandardSymbols();
    Symbol sym = divide.selector("/");
    assertEquals("symbol returned was not '/'", Symbol.DIVIDE, sym);
  }
  
  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void timeSymbolTest() { //TEST 51 - test to see if plus is returned as symbol.
    StandardSymbols time = new StandardSymbols();
    Symbol sym = time.selector("*");
    assertEquals("symbol returned was not '('", Symbol.TIMES, sym);
  }
  
  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void riBracketSymbolTest() { //TEST 52 - test to see if plus is returned as symbol.
    StandardSymbols add = new StandardSymbols();
    Symbol sym = add.selector(")");
    assertEquals("symbol returned was not ')'", Symbol.RIGHT_BRACKET, sym);
  }
  
  /** Test to check if selector method works.
   * Test returns the correct symbol when symbol is selected.
   */
  @Test
  public void leBracketSymbolTest() { //TEST 53 - test to see if plus is returned as symbol. 
    StandardSymbols bracket = new StandardSymbols();
    Symbol sym = bracket.selector("(");
    assertEquals("symbol returned was not '('", Symbol.LEFT_BRACKET, sym);
  }
  
  /** Test to check if correct precedence take place.
   *  Test checks if Times takes precedence over plus.
   */
  @Test
  public void precedenceTest1() { //TEST 54 - test to see if correct precedence takes place
    StandardSymbols pres = new StandardSymbols();
    Boolean bool = pres.symbolPrecedence(Symbol.TIMES, Symbol.PLUS);
    assertEquals("Precedence for times over plus was not correct.", true, bool);
  }

  /** Test to check if correct precedence take place.
   *  Test checks if Times takes precedence over minus.
   */
  @Test
  public void precedenceTest2() { //TEST 55 - test to see if correct precedence takes place
    StandardSymbols pres = new StandardSymbols();
    Boolean bool = pres.symbolPrecedence(Symbol.TIMES, Symbol.MINUS);
    assertEquals("Precedence for times over minus was not correct.", true, bool);
  }
  
  /** Test to check if correct precedence take place.
   *  Test checks if divide takes precedence over plus.
   */
  @Test
  public void precedenceTest3() { //TEST 56 - test to see if correct precedence takes place
    StandardSymbols pres = new StandardSymbols();
    Boolean bool = pres.symbolPrecedence(Symbol.DIVIDE, Symbol.PLUS);
    assertEquals("Precedence for divide over plus was not correct.", true, bool);
  }
  
  /** Test to check if correct precedence take place.
   *  Test checks if divide takes precedence over minus.
   */
  @Test
  public void precedenceTest4() { //TEST 57 - test to see if correct precedence takes place
    StandardSymbols pres = new StandardSymbols();
    Boolean bool = pres.symbolPrecedence(Symbol.DIVIDE, Symbol.MINUS);
    assertEquals("Precedence for divide over minus was not correct.", true, bool);
  }

}
