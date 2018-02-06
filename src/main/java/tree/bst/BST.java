package tree.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
  private Node root;

  public void insert(int data){
    root = insert(root, data);
  }

  public void inOrder(){
    inOrder(root);
  }

  public void preOrder(){
    preOrder(root);
  }

  public void postOrder() {
    postOrder(root);
  }

  public void bfs(){
    bfs(root);
  }

  public void delete(int data){

  }

  public boolean search(int data){

    boolean exist = search(root, data);

    return exist;
  }

  private boolean search(Node root, int data){
    if(root == null){
      return false;
    } else if(data < root.getData()){ // go left
      return search(root.getLeft(), data);
    } else if(data > root.getData()){// go right
      return search(root.getRight(), data);
    } else { // found
      return true;
    }
  }

  private Node insert(Node root, int data){
    if(root == null){
      root = new Node(data);
    } else if(data <= root.getData()){
      root.setLeft(insert(root.getLeft(), data));
    } else {
      root.setRight(insert(root.getRight(), data));
    }

    return root;
  }

  private void bfs(Node root) {
    Queue<Node> queue = new LinkedList<Node>();
    // add root
    if(root != null){
      queue.add(root);
    }

    while(!queue.isEmpty()) {
      Node node = queue.remove();
      System.out.println(node.getData());
      // add left and right and print root
      if(node.getLeft() != null) {
        queue.add(node.getLeft());
      }
      if(node.getRight() != null) {
        queue.add(node.getRight());
      }
    }
  }

  private void inOrder(Node root) {
    if(root != null){
      inOrder(root.getLeft());
      System.out.println(root.getData());
      inOrder(root.getRight());
    }
  }

  private void preOrder(Node root) {
    if(root != null) {
      System.out.println(root.getData());
      preOrder(root.getLeft());
      preOrder(root.getRight());
    }
  }




  private void postOrder(Node root) {
    if(root != null){
      postOrder(root.getLeft());
      postOrder(root.getRight());
      System.out.println(root.getData());
    }
  }
}
