package standardcalc;

import stack.Symbol;

public class StandardSymbols {

  /** Method to select correct symbol from string input.
   * @param str the symbol that needs to be converted to Symbol form.
   * @return sym symbol that is being selected.
   */
  public Symbol selector(String str) {
    Symbol sym = null;
    if (str.equals(Symbol.PLUS.toString())) {
      sym = Symbol.PLUS;
    } else if (str.equals(Symbol.MINUS.toString())) {
      sym = Symbol.MINUS;
    } else if (str.equals(Symbol.DIVIDE.toString())) {
      sym = Symbol.DIVIDE;
    } else if (str.equals(Symbol.TIMES.toString())) {
      sym = Symbol.TIMES;
    } else if (str.equals(Symbol.LEFT_BRACKET.toString())) {
      sym = Symbol.LEFT_BRACKET;
    } else if (str.equals(Symbol.RIGHT_BRACKET.toString())) {
      sym = Symbol.RIGHT_BRACKET;
    } 
    return sym;
  }
}

