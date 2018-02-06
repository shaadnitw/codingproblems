package tree.bst;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BSTTest {

  private BST bst;
  @Before
  public void init() {
    bst = new BST();
    int[] data = {30,10,50,5,20,4,50, 40, 60, 70, 22};
    for(int datum : data){
      bst.insert(datum);
    }
  }

  @Test
  public void searchTest() {
    Assert.assertTrue(bst.search(22));
    Assert.assertFalse(bst.search(0));
    Assert.assertTrue(bst.search(30));
    Assert.assertTrue(bst.search(70));
  }
  @Test
  public void testBFS(){
    System.out.println("BFS traversal is :");
    bst.bfs();
  }

  @Test
  public void testInorder(){
    System.out.println("Inorder traversal is :");
    bst.inOrder();
  }

  @Test
  public void testPreorder(){
    System.out.println("Preorder traversal is :");
    bst.preOrder();
  }

  @Test
  public void testPostorder(){
    System.out.println("Postorder traversal is :");
    bst.postOrder();
  }
}
