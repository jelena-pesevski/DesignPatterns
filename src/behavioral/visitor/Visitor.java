package behavioral.visitor;

public interface Visitor {

  void visit(Lion lion);
  void visit(Bear bear);
  void visit(Tiger tiger);
}
