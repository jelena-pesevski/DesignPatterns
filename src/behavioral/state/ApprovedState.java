package behavioral.state;

public class ApprovedState extends OrderState {
  private static ApprovedState instance = new ApprovedState();

  private ApprovedState() {}

  public static ApprovedState getInstance() {
    return instance;
  }
  @Override
  public void processOrder(Order order) {
    System.out.println("Order passes approved state");
    order.setState(ShippedState.getInstance());
  }
}
