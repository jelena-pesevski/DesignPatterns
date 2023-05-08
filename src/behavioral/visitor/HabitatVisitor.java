package behavioral.visitor;

public class HabitatVisitor implements Visitor{

  @Override
  public void visit(Lion lion) {
    System.out.println("Lion lives in savannas ...");
  }

  @Override
  public void visit(Bear bear) {
    System.out.println("Bear lives in forest...");
  }

  @Override
  public void visit(Tiger tiger) {
    System.out.println("Tiger lives in savannas...");
  }
}
