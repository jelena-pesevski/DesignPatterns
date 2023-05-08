package behavioral.visitor;

public class VisitorMain {

  public static void main(String[] args) {
    Visitor habitatVisitor = new HabitatVisitor();
    Visitor dietVisitor = new DietVisitor();

    Bear bear = new Bear();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();

    bear.accept(habitatVisitor);
    tiger.accept(habitatVisitor);
    lion.accept(habitatVisitor);

    bear.accept(dietVisitor);
    tiger.accept(dietVisitor);
    lion.accept(dietVisitor);
  }
}
