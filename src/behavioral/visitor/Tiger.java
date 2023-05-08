package behavioral.visitor;

public class Tiger implements Animal{

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
