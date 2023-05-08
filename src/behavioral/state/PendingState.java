package behavioral.state;

public class PendingState extends OrderState{

  private static PendingState instance = new PendingState();

  private PendingState() {}

  public static PendingState getInstance() {
    return instance;
  }

  @Override
  public void processOrder(Order order) {
    System.out.println("Order passes pending state");
    order.setState(ApprovedState.getInstance());
  }
}
