package behavioral.state;

public class Order {

  private OrderState orderState;

  public Order(){
    this.orderState=PendingState.getInstance();
  }

  public void setState(OrderState orderState){
    this.orderState=orderState;
  }

  public void process(){
    orderState.processOrder(this);
  }
}
