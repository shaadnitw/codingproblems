package arrays;

public class RotateMatrix {

  /**
   * Rotates a square matrix with extra array
   * @param input
   * @param size
   * @return
   */
  public int[][] rotateASquareMatrix(int[][] input, int size){
    int[][] output = new int[size][size];
    for(int i = 0; i < size; i++){
      for(int j = size - 1; j >= 0; j--){
        output[i][j] = input[(size-1) - j][i];
      }
    }
    return output;
  }

  public void printAMatrix(int[][] input){
    for(int i = 0; i < input.length; i++){
      for(int j = 0; j < input[i].length; j++){
        System.out.print(input[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
