package behavioral.chainofresponsibility;

public class ChainOfResponsibilityMain {

  public static void main(String[] args) {
    BaseHandler firstHandler = new PurchaseHandler();
    BaseHandler secondHandler = new RefundHandler();
    BaseHandler thirdHandler = new ReturnHandler();

    secondHandler.setNextHandler(thirdHandler);
    firstHandler.setNextHandler(secondHandler);

    System.out.println("Processing of return request");
    UserRequest userRequest=new UserRequest(RequestType.RETURN);

    firstHandler.process(userRequest);
  }
}
