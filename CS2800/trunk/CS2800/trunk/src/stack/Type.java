package stack;
/** a list of types of entry values an entry can represent.
 * @author zfac237
 *
 */

public enum Type {
  SYMBOL("SYMBOL"), NUMBER("NUMBER"), INVALID("INVALID"), STRING("STRING");

  String type;

  /** The constructor for creating Type objects with a char value.
   * @param symbol this uses the string value for each enumerator.
   */
  Type(String type) {
    this.type = type;
  }
  
  /** toString to create a string that identifies a specific Type.
   * @return String to return the Type object.
   */
  public String toString() {
    return String.valueOf(this.type);
  }

  /** Get method to return the Type object.
   * @return Character for object Type.
   */
  public String getType() {
    return this.type;
  }

}
