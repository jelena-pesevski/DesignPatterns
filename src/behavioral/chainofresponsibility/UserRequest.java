package behavioral.chainofresponsibility;

public class UserRequest {

  private final RequestType requestType;

  public UserRequest(RequestType requestType) {
    this.requestType = requestType;
  }

  public RequestType getRequestType() {
    return requestType;
  }
}
