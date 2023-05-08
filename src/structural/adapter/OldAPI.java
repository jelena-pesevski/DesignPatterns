package structural.adapter;

/*Old API that is used from client*/
public class OldAPI {

  public String query(String query) {
    System.out.printf("Old API executes query:%s%n", query);
    return "old API result";
  }
}
