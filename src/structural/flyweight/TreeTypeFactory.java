package structural.flyweight;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/*Factory for flyweight objects*/
public class TreeTypeFactory {

  private static final Set<TreeType> treeTypes = new HashSet<>();

  public static TreeType getTreeType(String color, String name, String texture) {
    Optional<TreeType> optional = treeTypes.stream().filter(
        treeType -> treeType.color().equals(color) && treeType.name().equals(name)
            && treeType.texture().equals(texture)).findFirst();

    if (optional.isEmpty()) {
      TreeType treeType = new TreeType(color, name, texture);
      treeTypes.add(treeType);
      return treeType;
    } else {
      return optional.get();
    }
  }

}
