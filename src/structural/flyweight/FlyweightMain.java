package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightMain {

  public static void main(String[] args) {
    List<Tree> trees = new ArrayList<>();

    System.out.println("Creating new tree types");

    TreeType treeType1 = TreeTypeFactory.getTreeType("a1", "b1", "c1");
    TreeType treeType2 = TreeTypeFactory.getTreeType("a2", "b2", "c2");
    TreeType treeType3 = TreeTypeFactory.getTreeType("a3", "b3", "c3");

    for (int i = 0; i < 100; i++) {
      trees.add(new Tree(treeType1, i, i));
      trees.add(new Tree(treeType2, i, i));
      trees.add(new Tree(treeType3, i, i));
    }

    System.out.println("Reusing tree type");

    treeType1 = TreeTypeFactory.getTreeType("a1", "b1", "c1");
    for (int i = 0; i < 100; i++) {
      trees.add(new Tree(treeType1, i, i));
    }
  }
}
