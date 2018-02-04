package strings;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AllUniqueCharsTest {

  private static AllUniqueChars allUnique;
  @BeforeClass
  public static void init() {
    allUnique = new AllUniqueChars();
  }

  @Test
  public void testAllUniqueChars() {
    String s = "123456789";
    boolean result = allUnique.areUniqueChars(s);
    Assert.assertTrue("The result not true", result);
  }

  @Test
  public void testWithDuplicates(){
    String s = "Abcdefghh1jklmn";
    boolean result = allUnique.areUniqueChars(s);
    Assert.assertFalse("The result not true", result);
  }

  @Test
  public void testWithEmptyString() {
    String s = "";
    boolean result = allUnique.areUniqueChars(s);
    Assert.assertTrue("The result not true", result);
  }


}
