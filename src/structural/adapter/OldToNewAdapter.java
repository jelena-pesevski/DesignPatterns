package structural.adapter;

import java.sql.ResultSet;

/* Adapter class, extends OldAPI so it could be used instead of it by client. Works with NewAPIQuery.
By implementing the Query interface, we can ensure that our structural.adapter class
can be used interchangeably with other classes that implement the Query interface.
For example, if we have other components in our application that expect to receive a
Query object, they can work with our structural.adapter class without needing to know the details
of how the structural.adapter works under the hood.*/

public class OldToNewAdapter extends OldAPI implements Query {

  private Query queryAPI;

  @Override
  public String query(String query) {
    //call new API
    queryAPI = new NewAPIQuery(query);
    ResultSet resultSet = queryAPI.execute(); //gets result from new db API

    /*here we could just implement wanted logic
     * it could be done without Query interface*/

    return "result from new API";
  }

  //in case we need to use it as Query interface implementation
  @Override
  public ResultSet execute() {
    return queryAPI.execute(); // this provides new API to be executed
  }
}
