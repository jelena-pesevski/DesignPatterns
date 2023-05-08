package behavioral.visitor;

public class Lion implements Animal{

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
