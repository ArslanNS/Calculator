package stack;

/** Storage object for the values in Stack class.
 * @author zfac237
 *
 */
public class Entry {

  float number;
  Symbol symbol;
  String string;
  Type type;

  /** Constructor that creates entry object for Symbol.
   * @param sym Symbol object for the constructor
   */
  public Entry(Symbol sym) {
    this.symbol = sym;
  }

  /** Constructor that creates entry object for Float.
   * @param f Float object for the constructor
   */
  public Entry(float f) {
    this.number = f;
  }

  /** Constructor that creates entry object for Symbol.
   * @param type Type object for the constructor
   */
  public Entry(Type type) {
    this.type = type;
  }

  /** Constructor that creates entry object for Symbol.
   * @param str String object for the constructor
   */
  public Entry(String str) {
    this.string = str;
  }
  
  /** Get method that throws BadType if the type is not Symbol.
   * @return Symbol of symbol that is being stores in Entry object for the stack.
   * @throws BadType Exception thrown when Entry object is used with the wring get method.
   */
  public Symbol getSymbol() throws BadType {
    if (this.symbol != null) {
      return this.symbol;
    } else {
      throw new BadType("Wrong input, Symbol expected");
    }
  }

  /** Get method that throws BadType if the type is not Float.
   * @return Float of float that is being stores in Entry object for the stack.
   * @throws BadType Exception thrown when Entry object is used with the wring get method.
   */
  public float getFloat() throws BadType {
    if (this.number != 0.0f) {
      return this.number;
    } else {
      throw new BadType("Wrong input, Float expected");
    }
  }

  /** Get method that throws BadType if the type is not Type.
   * @return Type of type that is being stores in Entry object for the stack.
   * @throws BadType Exception thrown when Entry object is used with the wring get method.
   */
  public Type getType() throws BadType {
    if (this.type != null) {
      return this.type;
    } else {
      throw new BadType("Wrong input, Type expected");
    }
  }

  /** Get method that throws BadType if the type is not String.
   * @return String of string that is being stores in Entry object for the stack.
   * @throws BadType Exception thrown when Entry object is used with the wring get method.
   */
  public String getString() throws BadType {
    if (this.string != null) {
      return this.string;
    } else {
      throw new BadType("Wrong input, String expected");
    }
  }

  /** toString method that identifies and converts the entry types to string.
   * @return String for the the entry types.
   */
  public String toString() {
    if (this.symbol != null) {
      return String.valueOf(getSymbol());
    } else if (this.number != 0.0f) {
      return String.valueOf(getFloat());
    } else if (this.type != null) {
      return String.valueOf(getType());
    } else if (this.string != null) {
      return string;
    }
    return null;
  }

}
