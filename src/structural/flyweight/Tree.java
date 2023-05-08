package structural.flyweight;

/*Class that holds extrinsic state*/
public class Tree {

  private TreeType treeType;
  private int x;
  private int y;

  public Tree(TreeType treeType, int x, int y) {
    this.treeType = treeType;
    this.x = x;
    this.y = y;
  }

  public void draw() {
    treeType.draw(x, y);
  }
}
