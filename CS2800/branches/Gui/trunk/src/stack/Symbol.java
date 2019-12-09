package stack;

/** A list of symbols to be used in a mathematical expression.
 * @author zfac237
 *
 */
public enum Symbol {
  TIMES('*'), DIVIDE('/'), PLUS('+'), MINUS('-'), INVALID('N'), LEFT_BRACKET('('), RIGHT_BRACKET(
      ')');

  char symbol;

  /** The constructor for creating Symbol objects with a char value.
   * @param symbol this uses the char value for each enumerator.
   */
  Symbol(char symbol) {
    this.symbol = symbol;
  }

  /** toString to create a string that identifies a specific symbol.
   * @return String to return the Symbol object.
   */
  public String toString() {
    return String.valueOf(this.symbol);
  }

  /** Get method to return the symbol object.
   * @return Character for object symbol.
   */
  public char getSymbol() {
    return this.symbol;
  }
}
