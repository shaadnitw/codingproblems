package strings;

/**
 * Given two string str1, str2. check if str2 is rotation of str1.
 * e.g. waterbottle is rotation of erbottlewat
 */
public class StringRotation {

  public boolean isRotation(String str1, String str2){
    if(str1 == null || str2 == null || str1.length() != str2.length()){
      return false;
    }

    String str1str1 = str1 + str1;
    boolean isSubstring = str1str1.contains(str2);

    return isSubstring;
  }
}
