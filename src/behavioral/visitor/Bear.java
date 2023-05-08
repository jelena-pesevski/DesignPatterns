package behavioral.visitor;

public class Bear implements Animal{

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
