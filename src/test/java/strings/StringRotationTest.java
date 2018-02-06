package strings;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringRotationTest {
  private static StringRotation sr;
  @BeforeClass
  public static void init() {
    sr = new StringRotation();
  }

  @Test
  public void testStringRotation(){
    String s1 = "waterbottle";
    String s2 = "erbottlewat";
    boolean isRotation = sr.isRotation(s1, s2);
    Assert.assertTrue(isRotation);
  }

  @Test
  public void testNotStringRotation(){
    String s1 = "waterbottle";
    String s2 = "twaerbottle";
    boolean isRotation = sr.isRotation(s1, s2);
    Assert.assertFalse(isRotation);
  }

  @Test
  public void testNotStringRotation1(){
    String s1 = "";
    String s2 = "twaerbottle";
    boolean isRotation = sr.isRotation(s1, s2);
    Assert.assertFalse(isRotation);

    isRotation = sr.isRotation(s1, null);
    Assert.assertFalse(isRotation);

  }
}
