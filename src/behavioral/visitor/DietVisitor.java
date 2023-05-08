package behavioral.visitor;

public class DietVisitor implements Visitor{

  @Override
  public void visit(Lion lion) {
    System.out.println("Lion's diet consists mainly of meat");
  }

  @Override
  public void visit(Tiger tiger) {
    System.out.println("Tiger's diet consists mainly of meat and sometimes plants");
  }

  @Override
  public void visit(Bear bear) {
    System.out.println("Bear's diet consists mainly of plants and sometimes meat");
  }
}
