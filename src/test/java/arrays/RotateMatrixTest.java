package arrays;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RotateMatrixTest {
  
  private static RotateMatrix matrix;
  @BeforeClass
  public static void init(){
    matrix = new RotateMatrix();
    
  } 
  
  @Test
  public void testRotateMatrix(){
    int size = 4;
    int[][] input = {
                      {1,2,3,4},
                      {5,6,7,8}, 
                      {9,10,11,12}, 
                      {13,14,15,16}
                  };
    System.out.println("Input Matrix :");
    matrix.printAMatrix(input);
    int[][] response = matrix.rotateASquareMatrix(input, size);
    System.out.println("\n");
    System.out.println("Output Matrix :");
    matrix.printAMatrix(response);

    for(int i = 0; i < size; i++){
      for(int j = 0; j < size; j++){
        Assert.assertEquals("Invalid value at array[" + i + "]" + "[" + j + "]", input[j][i], response[i][(size-1)-j]);
      }

    }
  }
}
