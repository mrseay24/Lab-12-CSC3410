// IntBST.java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class IntBST {
 protected IntBSTNode root;
 // all your previously implemented methods should be available
 public void delete (int el) {
 delete(el, root);
 }
 private void delete (int el, IntBSTNode n) {
 // recursively find the node to be deleted, i.e. a node with key==el
 // assume x is the node to be deleted, 3 cases might happen:
 // x is a leaf ? just remove x
 // x has a child ? replace x with its child and remove child
 // x has 2 children, in this case you should either
 // find the max key in x’s left subtree, or
 // find the min key in x’s right subtree
 // either way, replace the min or max with x and remove min or max
 }
 
 public static void main(String[] args) {
 IntBST bt = new IntBST();
 bt.insert(5);
 bt.insert(3);
 bt.insert(4);
 bt.insert(10);
 bt.insert(11);
 bt.insert(1);
 bt.insert(12);
 bt.delete(4);
 bt.preorder();
 bt.delete(11);
 bt.preorder();
 bt.delete(5);
 bt.preorder();
 }
}