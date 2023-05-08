package behavioral.chainofresponsibility;

/*Base handler class*/
public abstract class BaseHandler {

  private BaseHandler nextHandler;

  public void setNextHandler(BaseHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public abstract void process(UserRequest userRequest);

  protected void checkNext(UserRequest userRequest) {
    if (nextHandler == null) {
      System.out.println("Processing ended...");
    }else{
      nextHandler.process(userRequest);
    }

  }
}
