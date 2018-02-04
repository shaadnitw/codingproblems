package strings;
import java.util.HashMap;
import java.util.Map;

public class AllUniqueChars {

  /**
   * Find if the given input has all unique characters.
   * @param input
   * @return
   */
  public boolean areUniqueChars(String input){
    char[] toChar = input.toCharArray();
    Map<Character, Boolean> charExistMap = new HashMap();
    boolean allUnique = true;
    for(char ch : toChar){
      if(!charExistMap.containsKey(ch)) {
        charExistMap.put(ch, Boolean.TRUE);
      } else {
        allUnique = false;
        break;
      }
    }
    return allUnique;
  }
}
