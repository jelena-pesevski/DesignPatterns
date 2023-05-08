package behavioral.state;

public class CompletedState extends OrderState{

  private static CompletedState instance = new CompletedState();

  private CompletedState() {}

  public static CompletedState getInstance() {
    return instance;
  }

  @Override
  public void processOrder(Order order) {
    System.out.println("Order passes completed state");
  }
}
