package structural.adapter;

public class AdapterMain {

  public static void main(String[] args) {
    //in case when user uses OldAPI, we will just switch implementation to OldToNewAdapter
    //and it will then override method and call in it method from NewAPI

    OldAPI oldAPI = new OldAPI();
    System.out.println("Executing query with old API...");
    System.out.println(oldAPI.query("Query to be executed"));

    System.out.println("Changing to new API");

    oldAPI = new OldToNewAdapter();
    System.out.println("Executing query with new API");
    System.out.println(oldAPI.query("Query to be executed"));
  }
}
