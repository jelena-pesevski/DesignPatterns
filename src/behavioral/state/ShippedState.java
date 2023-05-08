package behavioral.state;

public class ShippedState extends OrderState {

  private static ShippedState instance = new ShippedState();

  private ShippedState() {
  }

  public static ShippedState getInstance() {
    return instance;
  }

  @Override
  public void processOrder(Order order) {
    System.out.println("Order passes shipped state");
    order.setState(CompletedState.getInstance());
  }
}